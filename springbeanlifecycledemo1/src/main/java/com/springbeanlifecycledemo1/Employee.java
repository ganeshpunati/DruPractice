package com.springbeanlifecycledemo1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//@Component
public class Employee implements InitializingBean,BeanNameAware,ApplicationContextAware,DisposableBean{
	
	//@Autowired
	private Department department;
	
	public Employee() {
		System.out.println("in employee Constructer Department is : "+department);	
	}
	public Department getDepartment() {
		return department;
	}
	  // @PostConstruct
		public void afterConstructor() {
			//System.out.println("Department : "+department);
			department.setDeptId("D101");
			System.out.println("in PostConstruct department is : "+department);
		}
		@Autowired
	public void setDepartment(Department department) {
		System.out.println("autowiring of department object");
		this.department = department;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("in afterProperties set InitializingBean inteface method");	
	}
	public void initData() {
		System.out.println("in custm initi method");
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("tha bean name : "+beanName);		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("in ApplicationContext Aware : ");
	}
//	@PreDestroy
	public void closeBeanResourses() {
		System.out.println("bean is  ready to get closed  or destroyed in @PreDestory");
	}
@Override
public void destroy() throws Exception {
	System.out.println("bean is  ready to get closed  or destroyed in disposable method");
}
}
