package springboot.crudjdbctemplate1.dao;

import springboot.crudjdbctemplate1.entity.Student;

public interface StudentRepository1 {

	public Boolean add(Student student);
	
	public Boolean updateStudentData(Student student);
	
	public Boolean deleteStudentData(String emailId);
}
