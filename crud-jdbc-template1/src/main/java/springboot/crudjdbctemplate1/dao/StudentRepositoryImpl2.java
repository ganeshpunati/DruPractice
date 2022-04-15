package springboot.crudjdbctemplate1.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import springboot.crudjdbctemplate1.entity.Student;

@Repository
public class StudentRepositoryImpl2 implements StudentRepository2{

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
   
	
	@Override
    public Boolean add(Student student) {
		String queryToInsertStudentDetails =
				"INSERT INTO student_ref"
				+ "(first_nm,last_nm,email_id,mobile_no,"
				+ "age,salary,description_nm,country_nm,state_nm,"
				+ "city_nm,pincode,address) "
				+ "VALUES(:firstNm,:lastNm,:emailId,:mobileNo,"
				+ ":age,:salary,:descriptionNm,:countryNm,:stateNm,"
				+ ":cityNm,:pincode,:address)";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("firstNm",student.getFirstNm());
		paramSource.addValue("lastNm",student.getLastNm());
		paramSource.addValue("emailId",student.getEmailId());
		paramSource.addValue("mobileNo",student.getMobileNo());
		paramSource.addValue("age",student.getAge());
		paramSource.addValue("salary",student.getSalary());
		paramSource.addValue("descriptionNm",student.getDescriptionNm());
		paramSource.addValue("countryNm",student.getCountryNm());
		paramSource.addValue("stateNm",student.getStateNm());
		paramSource.addValue("cityNm",student.getCityNm());
		paramSource.addValue("pincode",student.getPincode());
		paramSource.addValue("address",student.getAddress());
		namedParameterJdbcTemplate.update(queryToInsertStudentDetails, paramSource);
	    return true;
	}


	@Override
	public Boolean updateStudentData(Student student) {
		String queryToUpdateStudentDetails = "update student_ref set mobile_No = :mobileNo where first_Nm =:firstNm";
		MapSqlParameterSource updateParameters = new MapSqlParameterSource();
		updateParameters.addValue("firstNm",student.getFirstNm());
		updateParameters.addValue("mobileNo", student.getMobileNo());
		namedParameterJdbcTemplate.update(queryToUpdateStudentDetails,updateParameters);
		return true;
	}


	public Boolean deleteStudentData(String emailId) {
		String  queryToDeleteStudentDetails= "delete from student_ref where email_id =:emailId";
		MapSqlParameterSource updateParameters = new MapSqlParameterSource();
		updateParameters.addValue("emailId",emailId );
		 return namedParameterJdbcTemplate.update(queryToDeleteStudentDetails,updateParameters)>0;
		
		}
	}
