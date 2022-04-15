package springboot.crudjdbctemplate1.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import springboot.crudjdbctemplate1.entity.DeleteStudent;
import springboot.crudjdbctemplate1.entity.Student;

@Repository
public class StudentRepositoryImpl3 implements StudentRepository3 {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Boolean add(Student student) {
		String queryToInsertStudentDetails = "INSERT INTO student_ref" + "(first_nm,last_nm,email_id,mobile_no,"
				+ "age,salary,description_nm,country_nm,state_nm," + "city_nm,pincode,address) "
				+ "VALUES(:firstNm,:lastNm,:emailId,:mobileNo," + ":age,:salary,:descriptionNm,:countryNm,:stateNm,"
				+ ":cityNm,:pincode,:address)";
		
		 namedParameterJdbcTemplate.update(queryToInsertStudentDetails, new BeanPropertySqlParameterSource(student));
		 //new BeanPropertySqlParameterSource(student);
		 return true;
	}
	@Override
	public Boolean updateStudentData(Student student) {
		String queryToUpdateStudentDetails = "update student_ref set mobile_no = :mobileNo where first_nm =:firstNm";
		                                     
		namedParameterJdbcTemplate.update(queryToUpdateStudentDetails,new BeanPropertySqlParameterSource(student));
		return true;
		
	}
//	public Boolean deleteStudentData(String emailId) {
//		String  queryToDeleteStudentDetails= "delete from student_ref where email_id =:emailId";
//		//Student student =new Student();
//		 return namedParameterJdbcTemplate.update(queryToDeleteStudentDetails,new BeanPropertySqlParameterSource(emailId))>0;
//		
//		}
	
	
	public Boolean deleteStudentData(DeleteStudent student) {
		
		int b=0;
		String  queryToDeleteStudentDetails= "delete  from student_ref where email_id =:emailId";
		b= namedParameterJdbcTemplate.update(queryToDeleteStudentDetails,new BeanPropertySqlParameterSource(student));
		return b>0  ;
		}
}
