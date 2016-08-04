package com.rahul.learningspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {

		System.out.println("In postProcessAfterInitialization for bean " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		
		System.out.println("In postProcessBeforeInitialization for bean " + arg1);
		return arg0;
	}

}
