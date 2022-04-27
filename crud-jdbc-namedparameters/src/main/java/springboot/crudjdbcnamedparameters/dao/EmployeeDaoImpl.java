package springboot.crudjdbcnamedparameters.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import springboot.crudjdbcnamedparameters.entity.EmployeeDeptBean;
import springboot.crudjdbcnamedparameters.entity.EmployeeDesignationBean;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeDeatilsDto;
import springboot.crudjdbcnamedparameters.entity.FetchEmployeeRequest;
import springboot.crudjdbcnamedparameters.entity.InsertEmployeeRequest;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Boolean insertEmployeeDetails(InsertEmployeeRequest insertEmployeeRequest) {
		String queryToInsertEmployeeDetails = "insert  into employee_info_ref(first_nm,middle_nm,last_nm,email_id,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address)"
				+ "values(:firstNm,:middleNm,:lastNm,:emailId,:empSalary,:empAge,:mobileNo,:countryNm,:stateNm,:cityNm,:pincode,:address)";

		KeyHolder holder = new GeneratedKeyHolder();
		int count = 0;

		count = namedParameterJdbcTemplate.update(queryToInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });

		long empId = holder.getKey().longValue();

		Boolean result;

		if (count > 0) {

			String queryForInsertEmployeeDepartments = "insert into employee_department_ref (dept_id,emp_id,isactive) values(:deptId,:empId,true)";

			if (insertEmployeeRequest.getDepartmentList() != null
					&& insertEmployeeRequest.getDepartmentList().size() > 0) {

				for (EmployeeDeptBean employeeDeptBean : insertEmployeeRequest.getDepartmentList()) {

//					namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments,
//							new BeanPropertySqlParameterSource(employeeDeptBean));
					MapSqlParameterSource deptParameters = new MapSqlParameterSource().addValue("empId", empId)
							.addValue("deptId", employeeDeptBean.getDeptId());
					result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDepartments, deptParameters) > 0;
				}
			}

			String queryForInsertEmployeeDesignations = "insert into employee_designation_ref (designation_id,emp_id,isactive) values(:designationId,:empId,true)";
			if (insertEmployeeRequest.getDesignationList() != null
					&& insertEmployeeRequest.getDesignationList().size() > 0) {
				for (EmployeeDesignationBean employeeDesignationBean : insertEmployeeRequest.getDesignationList()) {

//					namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignations,
//							new BeanPropertySqlParameterSource(employeeDesignationBean));
					MapSqlParameterSource designationParameters = new MapSqlParameterSource().addValue("empId", empId)
							.addValue("designationId", employeeDesignationBean.getDesignationId());
					result = namedParameterJdbcTemplate.update(queryForInsertEmployeeDesignations,
							designationParameters) > 0;

				}

			}
		}
		return true;
	}

	// =======================================================================
	public Boolean insertEmployeeRequestList(List<InsertEmployeeRequest> insertEmployeeRequestList) {

		for (InsertEmployeeRequest insertEmployeeRequest : insertEmployeeRequestList) {
			int count = 0;
			KeyHolder holder = new GeneratedKeyHolder();
			String queryForInsertEmployeeData = "insert  into employee_info_ref(first_nm,middle_nm,last_nm,email_id,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address)"
					+ "values(:firstNm,:middleNm,:lastNm,:emailId,:empSalary,:empAge,:mobileNo,:countryNm,:stateNm,:cityNm,:pincode,:address)";

			if (insertEmployeeRequest.getEmpId() == null) {
				count = namedParameterJdbcTemplate.update(queryForInsertEmployeeData,
						new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });
				insertEmployeeRequest.setEmpId(holder.getKey().longValue());
			} else {

				String queryForUpdateEmployeeData = "Update employee_info_ref set first_nm=:firstNm,email_id=:emailId,mobile_no=:mobileNo where emp_id=:empId";
				count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeData,
						new BeanPropertySqlParameterSource(insertEmployeeRequest));
			}

			if (count > 0) {

				String queryToInsertEmpDeprtments = "insert into employee_department_ref (dept_id,emp_id,isactive) values (:deptId,:empId,true)";
				List<EmployeeDeptBean> empDeptRefSave = new ArrayList<>();
				if (insertEmployeeRequest.getDepartmentList() != null
						&& insertEmployeeRequest.getDepartmentList().size() > 0)
					for (EmployeeDeptBean employeeDeptBean : insertEmployeeRequest.getDepartmentList()) {
						employeeDeptBean.setEmpId(holder.getKey().longValue());
						empDeptRefSave.add(employeeDeptBean);
					}

				SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(empDeptRefSave.toArray());
				namedParameterJdbcTemplate.batchUpdate(queryToInsertEmpDeprtments, parameters);

				String queryToInsertEmpDesignations = "insert into employee_designation_ref (designation_id,emp_id,isactive) values (:designationId,:empId,true)";
				List<EmployeeDesignationBean> empDesignationRefSave = new ArrayList<>();
				if (insertEmployeeRequest.getDesignationList() != null
						&& insertEmployeeRequest.getDesignationList().size() > 0) {
					for (EmployeeDesignationBean employeeDesignationBean : insertEmployeeRequest.getDesignationList()) {
						employeeDesignationBean.setEmpId(holder.getKey().longValue());
						empDesignationRefSave.add(employeeDesignationBean);
						SqlParameterSource[] values = SqlParameterSourceUtils
								.createBatch(empDesignationRefSave.toArray());
						namedParameterJdbcTemplate.batchUpdate(queryToInsertEmpDesignations, values);

					}

				}

			}
		}
		return true;
	}

	/// ========================================================

	public Boolean insertEmployeeRequestListUsingJdbcTemplate(
			List<InsertEmployeeRequest> insertEmployeeRequestListUsingJdbcTemplate) {

		for (InsertEmployeeRequest insertEmployeeRequest : insertEmployeeRequestListUsingJdbcTemplate) {
			int count = 0;
			KeyHolder holder = new GeneratedKeyHolder();
			String queryForInsertEmployeeData = "insert  into employee_info_ref(first_nm,middle_nm,last_nm,email_id,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address)"
					+ "values(:firstNm,:middleNm,:lastNm,:emailId,:empSalary,:empAge,:mobileNo,:countryNm,:stateNm,:cityNm,:pincode,:address)";

			if (insertEmployeeRequest.getEmpId() == null) {
				count = namedParameterJdbcTemplate.update(queryForInsertEmployeeData,
						new BeanPropertySqlParameterSource(insertEmployeeRequest), holder, new String[] { "emp_id" });
				insertEmployeeRequest.setEmpId(holder.getKey().longValue());
			} else {

				String queryForUpdateEmployeeData = "Update employee.info_ref set first_nm=:firstNm,email_id=:emailId,mobile_no=:mobileNo where emp_id=:empId";
				count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeData,
						new BeanPropertySqlParameterSource(insertEmployeeRequest));
			}

			if (count > 0) {

				if (insertEmployeeRequest.getDepartmentList() != null
						&& insertEmployeeRequest.getDepartmentList().size() > 0) {
					String queryToInsertEmpDepartments = "insert into employee_department_ref (dept_id,emp_id,isactive) values (?,?,true)";
					int[] result = jdbcTemplate.batchUpdate(queryToInsertEmpDepartments,
							new BatchPreparedStatementSetter() {
								@Override
								public void setValues(PreparedStatement ps, int i) throws SQLException {
									EmployeeDeptBean employeeDeptObj = insertEmployeeRequest.getDepartmentList().get(i);
									if (employeeDeptObj.getDeptId() != null) {
										ps.setLong(1, employeeDeptObj.getDeptId());
									} else {
										ps.setNull(1, java.sql.Types.BIGINT);
									}
									ps.setLong(2, insertEmployeeRequest.getEmpId());
								}

								@Override
								public int getBatchSize() {
									return insertEmployeeRequest.getDepartmentList().size();
								}
							});
				}
				if (insertEmployeeRequest.getDesignationList() != null
						&& insertEmployeeRequest.getDesignationList().size() > 0) {
					String queryToInsertEmpDesignations = "insert into employee_designation_ref (designation_id,emp_id,isactive) values (?,?,true)";
					int[] result = jdbcTemplate.batchUpdate(queryToInsertEmpDesignations,
							new BatchPreparedStatementSetter() {
								@Override
								public void setValues(PreparedStatement ps, int i) throws SQLException {
									EmployeeDesignationBean employeeDesignationObj = insertEmployeeRequest
											.getDesignationList().get(i);
									if (employeeDesignationObj.getDesignationId() != null) {
										ps.setLong(1, employeeDesignationObj.getDesignationId());
									} else {
										ps.setNull(1, java.sql.Types.BIGINT);
									}
									ps.setLong(2, insertEmployeeRequest.getEmpId());
								}

								@Override
								public int getBatchSize() {
									return insertEmployeeRequest.getDesignationList().size();
								}
							});
				}
			}
		}
		return true;
	}

	@Override
	public List<InsertEmployeeRequest> fetchAllDeatils() {
		// String queryForFetchDetails ="select
		// emp_id,emp_nm,emp_email,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address
		// from employee_info_ref";
		String queryForFetchDetails = "SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,dsr.designation_nm\r\n"
				+ "FROM  productdb.employee_info_ref  eir\r\n" + "INNER JOIN productdb.employee_department_ref  edp\r\n"
				+ "ON  eir.emp_id = edp.emp_id \r\n" + "INNER JOIN productdb.employee_designation_ref  eds\r\n"
				+ "ON eir.emp_id = eds.emp_id\r\n" + "INNER JOIN   productdb.department_ref dr\r\n"
				+ "ON edp.dept_id =dr.dept_id\r\n" + "INNER JOIN productdb.designation_ref dsr\r\n"
				+ "ON  eds.designation_id =dsr.designation_id";
		return namedParameterJdbcTemplate.query(queryForFetchDetails, new InsertEmployeeRequestMapper());
	}

	class InsertEmployeeRequestMapper implements RowMapper<InsertEmployeeRequest> {
		public InsertEmployeeRequest mapRow(ResultSet rs, int rowNum) throws SQLException {

			InsertEmployeeRequest insertEmployeeRequest = new InsertEmployeeRequest();
			EmployeeDeptBean employeeDeptBean = new EmployeeDeptBean();
			List<EmployeeDeptBean> employeeDepartemntList = new ArrayList<>();
			EmployeeDesignationBean employeeDesignationBean = new EmployeeDesignationBean();
			List<EmployeeDesignationBean> employeeDesignationList = new ArrayList<>();

			insertEmployeeRequest.setEmpId(rs.getLong("emp_id"));
			insertEmployeeRequest.setFirstNm(rs.getString("first_nm"));
			insertEmployeeRequest.setMiddleNm(rs.getString("middle_nm"));
			insertEmployeeRequest.setLastNm(rs.getString("last_nm"));
			insertEmployeeRequest.setEmailId(rs.getString("email_id"));
			insertEmployeeRequest.setEmpSalary(rs.getDouble("emp_salary"));
			insertEmployeeRequest.setEmpAge(rs.getInt("emp_age"));
			insertEmployeeRequest.setMobileNo(rs.getLong("mobile_no"));
			insertEmployeeRequest.setCountryNm(rs.getString("country_nm"));
			insertEmployeeRequest.setStateNm(rs.getString("state_nm"));
			insertEmployeeRequest.setCityNm(rs.getString("city_nm"));
			insertEmployeeRequest.setPincode(rs.getInt("pincode"));
			insertEmployeeRequest.setAddress(rs.getString("address"));

			employeeDeptBean.setDeptId(rs.getLong("dept_id"));
			employeeDeptBean.setDeptNm(rs.getString("dept_nm"));
			employeeDeptBean.setEmpDeptId(rs.getLong("emp_dept_id"));
			employeeDeptBean.setEmpId(rs.getLong("emp_id"));
			employeeDeptBean.setIsactive(rs.getBoolean(1));
			employeeDepartemntList.add(employeeDeptBean);
			insertEmployeeRequest.setDepartmentList(employeeDepartemntList);

			employeeDesignationBean.setDesignationId(rs.getLong("designation_id"));
			employeeDesignationBean.setDesignationNm(rs.getString("designation_nm"));
			employeeDesignationBean.setEmpDesignationId(rs.getLong("emp_designation_id"));
			employeeDesignationBean.setEmpId(rs.getLong("emp_id"));
			employeeDesignationBean.setIsactive(rs.getBoolean(1));
			employeeDesignationList.add(employeeDesignationBean);
			insertEmployeeRequest.setDesignationList(employeeDesignationList);

			return insertEmployeeRequest;
		}

	}

	@Override
	public InsertEmployeeRequest fetchById(Long emp_id) {
		// String queryForFetchById = "select
		// emp_id,emp_nm,emp_email,emp_salary,emp_age,mobile_no,country_nm,state_nm,city_nm,pincode,address
		// from employee_info_ref where emp_id = :empId";
		String queryForFetchById = "SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,dsr.designation_nm FROM  productdb.employee_info_ref  eir INNER JOIN productdb.employee_department_ref  edp ON  eir.emp_id = edp.emp_id  INNER JOIN productdb.employee_designation_ref  eds ON eir.emp_id = eds.emp_id INNER JOIN   productdb.department_ref dr ON edp.dept_id =dr.dept_id INNER JOIN productdb.designation_ref dsr ON  eds.designation_id =dsr.designation_id where eir.emp_id=:empId ";

		Map<String, Long> parameters = new HashMap<String, Long>();
		parameters.put("empId", emp_id);
		return (InsertEmployeeRequest) namedParameterJdbcTemplate.queryForObject(queryForFetchById, parameters,
				new InsertEmployeeRequestMapperForEmployeeId());
	}

	private static final class InsertEmployeeRequestMapperForEmployeeId implements RowMapper<InsertEmployeeRequest> {
		public InsertEmployeeRequest mapRow(ResultSet rs, int rowNum) throws SQLException {

			InsertEmployeeRequest insertEmployeeRequest = new InsertEmployeeRequest();

			EmployeeDeptBean employeeDeptBean = new EmployeeDeptBean();
			List<EmployeeDeptBean> employeeDepartemntList = new ArrayList<>();
			EmployeeDesignationBean employeeDesignationBean = new EmployeeDesignationBean();
			List<EmployeeDesignationBean> employeeDesignationList = new ArrayList<>();

			insertEmployeeRequest.setEmpId(rs.getLong("emp_id"));
			insertEmployeeRequest.setFirstNm(rs.getString("first_nm"));
			insertEmployeeRequest.setMiddleNm(rs.getString("middle_nm"));
			insertEmployeeRequest.setLastNm(rs.getString("last_nm"));
			insertEmployeeRequest.setEmailId(rs.getString("email_id"));
			insertEmployeeRequest.setEmpSalary(rs.getDouble("emp_salary"));
			insertEmployeeRequest.setEmpAge(rs.getInt("emp_age"));
			insertEmployeeRequest.setMobileNo(rs.getLong("mobile_no"));
			insertEmployeeRequest.setCountryNm(rs.getString("country_nm"));
			insertEmployeeRequest.setStateNm(rs.getString("state_nm"));
			insertEmployeeRequest.setCityNm(rs.getString("city_nm"));
			insertEmployeeRequest.setPincode(rs.getInt("pincode"));
			insertEmployeeRequest.setAddress(rs.getString("address"));

			employeeDeptBean.setDeptId(rs.getLong("dept_id"));
			employeeDeptBean.setDeptNm(rs.getString("dept_nm"));
			employeeDeptBean.setEmpDeptId(rs.getLong("emp_dept_id"));
			employeeDeptBean.setEmpId(rs.getLong("emp_id"));
			employeeDeptBean.setIsactive(rs.getBoolean(1));
			employeeDepartemntList.add(employeeDeptBean);
			insertEmployeeRequest.setDepartmentList(employeeDepartemntList);

			employeeDesignationBean.setDesignationId(rs.getLong("designation_id"));
			employeeDesignationBean.setDesignationNm(rs.getString("designation_nm"));
			employeeDesignationBean.setEmpDesignationId(rs.getLong("emp_designation_id"));
			employeeDesignationBean.setEmpId(rs.getLong("emp_id"));
			employeeDesignationBean.setIsactive(rs.getBoolean(1));
			employeeDesignationList.add(employeeDesignationBean);
			insertEmployeeRequest.setDesignationList(employeeDesignationList);

			return insertEmployeeRequest;
		}
	}

	public List<InsertEmployeeRequest> fetchOneColomn() {
		String queryForFetchOneColomn = "select emp_id from employee_info_ref";

		return namedParameterJdbcTemplate.query(queryForFetchOneColomn,
				new InsertEmployeeRequestMapperForFetchOneColomn());

	}

	private static final class InsertEmployeeRequestMapperForFetchOneColomn
			implements RowMapper<InsertEmployeeRequest> {

		public InsertEmployeeRequest mapRow(ResultSet rs, int rowNum) throws SQLException {

			InsertEmployeeRequest insertEmployeeRequest = new InsertEmployeeRequest();

			insertEmployeeRequest.setEmpId(rs.getLong("emp_id"));

			return insertEmployeeRequest;
		}
	}
// =====================================================================================

	@Override
	public String fetchEmployeeNameByEmpIdUsingObject(FetchEmployeeRequest fetchEmployeeRequest) {

		String queryForFetchEmployeeNmByEmpIdUsingObject = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm) as emp_nm from employee_info_ref eir INNER JOIN employee_department_ref  edr ON  eir.emp_id = edr.emp_id  where eir.emp_id=:empId and edr.dept_id=:deptId and edr.isactive=true ";

		return namedParameterJdbcTemplate.queryForObject(queryForFetchEmployeeNmByEmpIdUsingObject,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest), String.class);

	}

//=========================================================================================
	@Override
	public FetchEmployeeDeatilsDto fetchEmployeeNameByEmpIdUsingMap(FetchEmployeeRequest fetchEmployeeRequest) {

		FetchEmployeeDeatilsDto fetchEmployeeDeatilsDto = new FetchEmployeeDeatilsDto();
		String queryForFetchEmployeeNmByEmpIdUsingMap = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm) as emp_nm,edr.emp_id,first_nm,middle_nm,last_nm,mobile_no,emp_salary,email_id,emp_age,country_nm,state_nm,city_nm,pincode,address from employee_info_ref eir INNER JOIN employee_department_ref  edr ON  eir.emp_id = edr.emp_id  where eir.emp_id=:empId and edr.dept_id=:deptId and edr.isactive=true";

		Map<String, Object> map = namedParameterJdbcTemplate.queryForMap(queryForFetchEmployeeNmByEmpIdUsingMap,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));

		fetchEmployeeDeatilsDto = new FetchEmployeeDeatilsDto();
		fetchEmployeeDeatilsDto.setEmpId((Long) map.get("emp_id"));
		fetchEmployeeDeatilsDto.setEmpNm((String) map.get("emp_nm"));
		fetchEmployeeDeatilsDto.setFirstNm((String) map.get("first_nm"));
		fetchEmployeeDeatilsDto.setMiddleNm((String) map.get("middle_nm"));
		fetchEmployeeDeatilsDto.setLastNm((String) map.get("last_nm"));
		fetchEmployeeDeatilsDto.setEmailId((String) map.get("email_id"));
		fetchEmployeeDeatilsDto.setMobileNo((Long) map.get("mobile_no"));
		fetchEmployeeDeatilsDto.setEmpSalary((Double) map.get("emp_salary"));
		fetchEmployeeDeatilsDto.setEmpAge((Integer) map.get("emp_age"));
		fetchEmployeeDeatilsDto.setCountryNm((String) map.get("country_nm"));
		fetchEmployeeDeatilsDto.setStateNm((String) map.get("state_nm"));
		fetchEmployeeDeatilsDto.setCityNm((String) map.get("city_nm"));
		fetchEmployeeDeatilsDto.setPincode((Integer) map.get("pincode"));
		fetchEmployeeDeatilsDto.setAddress((String) map.get("address"));
		return fetchEmployeeDeatilsDto;

	}
//==============================================================
	@Override
	public List<FetchEmployeeDeatilsDto> fetchAllEmployeesUsingList(FetchEmployeeRequest fetchEmployeeRequest) {

		List<FetchEmployeeDeatilsDto> fetchEmployeeList = new ArrayList<>();

		String queryForFetchEmployeeNmByEmpIdUsingList = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm) as emp_nm,edr.emp_id,first_nm,middle_nm,last_nm,mobile_no,email_id,emp_salary,emp_age,country_nm,state_nm,city_nm,pincode,address from employee_info_ref eir INNER JOIN employee_department_ref  edr ON  eir.emp_id = edr.emp_id  where edr.isactive=true";
		StringBuilder query = new StringBuilder(queryForFetchEmployeeNmByEmpIdUsingList);
		if (fetchEmployeeRequest.getEmpNm() != null) {
			query.append(" AND concat(first_nm,' ',middle_nm,' ',last_nm) ilike '%' ||:empNm||'%' ");

		}

		if (fetchEmployeeRequest.getMobileNo() != null) {
			query.append(" AND mobile_no=:mobileNo ");
		}
		query.append(" order by mobile_no desc ");

		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(query.toString(),
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		FetchEmployeeDeatilsDto fetchEmployeeDeatilsDto = null;
		for (Map<String, Object> row : rows) {
			fetchEmployeeDeatilsDto = new FetchEmployeeDeatilsDto();
			fetchEmployeeDeatilsDto.setEmpId((Long) row.get("emp_id"));
			fetchEmployeeDeatilsDto.setEmpNm((String) row.get("emp_nm"));
			fetchEmployeeDeatilsDto.setFirstNm((String) row.get("first_nm"));
			fetchEmployeeDeatilsDto.setMiddleNm((String) row.get("middle_nm"));
			fetchEmployeeDeatilsDto.setLastNm((String) row.get("last_nm"));
			fetchEmployeeDeatilsDto.setEmailId((String) row.get("email_id"));
			fetchEmployeeDeatilsDto.setMobileNo((Long) row.get("mobile_no"));
			fetchEmployeeDeatilsDto.setEmpSalary((Double) row.get("emp_salary"));
			fetchEmployeeDeatilsDto.setEmpAge((Integer) row.get("emp_age"));
			fetchEmployeeDeatilsDto.setCountryNm((String) row.get("country_nm"));
			fetchEmployeeDeatilsDto.setStateNm((String) row.get("state_nm"));
			fetchEmployeeDeatilsDto.setCityNm((String) row.get("city_nm"));
			fetchEmployeeDeatilsDto.setPincode((Integer) row.get("pincode"));
			fetchEmployeeDeatilsDto.setAddress((String) row.get("address"));

			fetchEmployeeList.add(fetchEmployeeDeatilsDto);

		}
		return fetchEmployeeList;

	}

//========================================================
	@Override
	public List<FetchEmployeeDeatilsDto> fetchEmployeeNameByEmpIdUsingQuery(FetchEmployeeRequest fetchEmployeeRequest) {

		String queryForFetchEmployeeNmByEmpIdUsingQuery = "SELECT concat(first_nm,' ',middle_nm,' ',last_nm) as emp_nm,edr.emp_id,first_nm,middle_nm,last_nm,mobile_no,email_id,emp_salary,emp_age,country_nm,state_nm,city_nm,pincode,address from employee_info_ref eir INNER JOIN employee_department_ref  edr ON  eir.emp_id = edr.emp_id  where eir.emp_id=:empId and edr.isactive=true";

		return namedParameterJdbcTemplate.query(queryForFetchEmployeeNmByEmpIdUsingQuery,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest),
				new BeanPropertyRowMapper<FetchEmployeeDeatilsDto>(FetchEmployeeDeatilsDto.class));

	}

//======================================================
	@Override
	public List<FetchEmployeeDeatilsDto> fetchAllEmployeeDetails(FetchEmployeeRequest fetchEmployeeRequest) {

		String fetchAllEmployeeDetails = "SELECT eir.emp_id,eir.first_nm,eir.middle_nm,eir.last_nm,eir.email_id,eir.emp_salary,eir.emp_age,eir.mobile_no,eir.country_nm,eir.state_nm,eir.city_nm,eir.pincode,eir.address,edp.emp_dept_id,edp.emp_id,edp.dept_id,edp.isactive,eds.emp_designation_id,eds.emp_id,eds.designation_id,eds.isactive,dr.dept_id,dr.dept_nm,dsr.designation_id,dsr.designation_nm FROM  productdb.employee_info_ref  eir INNER JOIN productdb.employee_department_ref  edp ON  eir.emp_id = edp.emp_id  INNER JOIN productdb.employee_designation_ref  eds ON eir.emp_id = eds.emp_id INNER JOIN   productdb.department_ref dr ON edp.dept_id =dr.dept_id INNER JOIN productdb.designation_ref dsr ON  eds.designation_id =dsr.designation_id ";

		FetchEmployeeDeatilsDto fetchEmployeeDeatilsDto = null;
		
		List<FetchEmployeeDeatilsDto> fetchEmployeeDeatilsDtoList = new ArrayList<>();
		List<EmployeeDeptBean> employeeDepartemntList = null;
		List<EmployeeDesignationBean> employeeDesignationList = null;
		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(fetchAllEmployeeDetails,
				new BeanPropertySqlParameterSource(fetchEmployeeRequest));
		Set<Long>set=new HashSet<>();
		int count=0;
		for (Map<String, Object> row : rows) {
			count++;
			if(set.add((Long)row.get("emp_id"))){
				if(fetchEmployeeDeatilsDto != null) {
					fetchEmployeeDeatilsDto.setDepartmentList(employeeDepartemntList);
					fetchEmployeeDeatilsDto.setDesignationList(employeeDesignationList);
				}
				fetchEmployeeDeatilsDto = new FetchEmployeeDeatilsDto();
				fetchEmployeeDeatilsDto.setEmpId((Long) row.get("emp_id"));
				fetchEmployeeDeatilsDto.setEmpNm((String) row.get("emp_nm"));
				fetchEmployeeDeatilsDto.setFirstNm((String) row.get("first_nm"));
				fetchEmployeeDeatilsDto.setMiddleNm((String) row.get("middle_nm"));
				fetchEmployeeDeatilsDto.setLastNm((String) row.get("last_nm"));
				fetchEmployeeDeatilsDto.setEmailId((String) row.get("email_id"));
				fetchEmployeeDeatilsDto.setMobileNo((Long) row.get("mobile_no"));
				fetchEmployeeDeatilsDto.setEmpSalary((Double) row.get("emp_salary"));
				fetchEmployeeDeatilsDto.setEmpAge((Integer) row.get("emp_age"));
				fetchEmployeeDeatilsDto.setCountryNm((String) row.get("country_nm"));
				fetchEmployeeDeatilsDto.setStateNm((String) row.get("state_nm"));
				fetchEmployeeDeatilsDto.setCityNm((String) row.get("city_nm"));
				fetchEmployeeDeatilsDto.setPincode((Integer) row.get("pincode"));
				fetchEmployeeDeatilsDto.setAddress((String) row.get("address"));
			     employeeDepartemntList = new ArrayList<>();
			     employeeDesignationList = new ArrayList<>();
			}
			EmployeeDeptBean fechEmpDeptBean = new EmployeeDeptBean();
			fechEmpDeptBean.setDeptId((Long) row.get("dept_id"));
			fechEmpDeptBean.setDeptNm((String) row.get("dept_nm"));
			fechEmpDeptBean.setEmpDeptId((Long) row.get("emp_dept_id"));
			fechEmpDeptBean.setEmpId((Long) row.get("emp_id"));
			fechEmpDeptBean.setIsactive((Boolean) row.get("isactive"));
			employeeDepartemntList.add(fechEmpDeptBean);
			
			EmployeeDesignationBean fetchEmpDesignationBean = new EmployeeDesignationBean();
			fetchEmpDesignationBean.setDesignationId((Long) row.get("designation_id"));
			fetchEmpDesignationBean.setDesignationNm((String) row.get("designation_nm"));
			fetchEmpDesignationBean.setEmpDesignationId((Long) row.get("emp_designation_id"));
			fetchEmpDesignationBean.setEmpId((Long) row.get("emp_id"));
			fetchEmpDesignationBean.setIsactive((Boolean) row.get("isactive"));
			employeeDesignationList.add(fetchEmpDesignationBean);
			if(count==rows.size() && fetchEmployeeDeatilsDto != null) {
				
				fetchEmployeeDeatilsDto.setDesignationList(employeeDesignationList);
				fetchEmployeeDeatilsDto.setDepartmentList(employeeDepartemntList);
			}
			

			fetchEmployeeDeatilsDtoList.add(fetchEmployeeDeatilsDto);
		}
		return fetchEmployeeDeatilsDtoList;

	}

}