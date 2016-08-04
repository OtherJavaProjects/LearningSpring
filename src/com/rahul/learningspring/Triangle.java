package com.rahul.learningspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

	private Point pointa;
	private Point pointb;
	private Point pointc;

	 public Point getPointa() {
		return pointa;
	}

	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}

	public Point getPointb() {
		return pointb;
	}

	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}

	public Point getPointc() {
		return pointc;
	}

	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}

	// private String type;
	// private int height;
	//
	// public Triangle(){}
	//
	// public Triangle(String type){
	// System.out.println("constructor called!!!");
	// this.type = type;
	// }
	//
	// public Triangle(String type, int height){
	// System.out.println("constructor 2 called!!!");
	// this.type = type;
	// this.height = height;
	// }
	//
	public void draw() {
		// System.out.println("Type: " + type);
		// System.out.println("Height: " + height);
		// System.out.println("Drawing Triangle!");

		System.out.println("Point a: x = " + pointa.getX() + ", y = " + pointa.getY());
		System.out.println("Point b: x = " + pointb.getX() + ", y = " + pointb.getY());
		System.out.println("Point c: x = " + pointc.getX() + ", y = " + pointc.getY());
	}
	//
	// public String getType() {
	// return type;
	// }
	//
	// public void setType(String type) {
	// System.out.println("setter called!!!");
	// this.type = type;
	// }
	//
	// public int getHeight() {
	// return height;
	// }
	//
	// public void setHeight(int height) {
	// this.height = height;
	// }

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name: " + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle bean initialized!");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean getting destroyed!");
	}

	public void myInit(){
		System.out.println("My init called!");		
	}
	
	public void myCleanUp(){
		System.out.println("My Clean Up called!");		
	}
	
}
