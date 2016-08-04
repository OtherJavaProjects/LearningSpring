package com.rahul.learningspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] str) {

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
//		Triangle triangle = (Triangle)factory.getBean("triangle");
//		triangle.draw();
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_component.xml");
		context.registerShutdownHook();
		
		
//		Triangle triangle = (Triangle)context.getBean("triangle");
//		triangle.draw();
//		Circle circle = (Circle)context.getBean("circle");
//		circle.draw();
		
		Shape shape = (Circle)context.getBean("circle");
		shape.draw();
	}
}