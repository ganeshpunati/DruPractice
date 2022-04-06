package com.springbeanlifecycledemo1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AppBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean,String beanName) 
			throws BeansException{
		System.out.println("bean name in post process before initilization : "+beanName);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean,String beanName) 
			throws BeansException{
		System.out.println("bean name in post process after initilization : "+beanName);
		return bean;
	}
}
