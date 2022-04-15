package springboot.crudjdbctemplate1.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import springboot.crudjdbctemplate1.entity.Student;


@Repository
public class StudentRepositoryImpl1 implements StudentRepository1 {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	@Override
	public Boolean add(Student student) {
		String queryToInsertStudentDetails =
				"INSERT INTO student_ref(first_nm,last_nm,email_id,mobile_no,age,salary,description_nm,country_nm,state_nm,city_nm,pincode,address) VALUES(:firstNm,:lastNm,:emailId,:mobileNo,:age,:salary,:descriptionNm,:countryNm,:stateNm,:cityNm,:pincode,:address)";
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("firstNm",student.getFirstNm());
		parameters.put("lastNm", student.getLastNm());
		parameters.put("emailId",student.getEmailId());
		parameters.put("mobileNo", student.getMobileNo());
		parameters.put("age",student.getAge());
		parameters.put("salary", student.getSalary());
		parameters.put("descriptionNm",student.getDescriptionNm());
		parameters.put("countryNm", student.getCountryNm());
		parameters.put("stateNm",student.getStateNm());
		parameters.put("cityNm", student.getCityNm());
		parameters.put("pincode",student.getPincode());
		parameters.put("address", student.getAddress());
		
		 namedParameterJdbcTemplate.update(queryToInsertStudentDetails, parameters);
		 //new BeanPropertySqlParameterSource(student);
		 return true;
	}
	@Override
	public Boolean updateStudentData(Student student) {
		String queryToUpdateStudentDetails = "update student_ref set mobile_No = :mobileNo where first_Nm =:firstNm";
		Map<String,Object> updateParameters = new HashMap<>();
		updateParameters.put("firstNm",student.getFirstNm());
		updateParameters.put("mobileNo", student.getMobileNo());
		namedParameterJdbcTemplate.update(queryToUpdateStudentDetails,updateParameters);
		return true;
	}
	public Boolean deleteStudentData(String emailId) {
	String  queryToDeleteStudentDetails= "delete from student_ref where email_id =:emailId";
	Map<String,Object> updateParameters = new HashMap<>();
	updateParameters.put("emailId",emailId );
	 return namedParameterJdbcTemplate.update(queryToDeleteStudentDetails,updateParameters)>0;
	
	}
}
