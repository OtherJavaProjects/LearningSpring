package com.rahul.learningspring;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point point = null;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("drawingcircle", null, "Hi, default!", Locale.FRANCE));
		System.out.println(messageSource.getMessage("drawingmessage", new Object[]{point.getX(), point.getY()}, "No Drawing Message!", Locale.FRANCE));
		
		publisher.publishEvent(new DrawEvent(this));
	}

	public Point getPoint() {
		return point;
	}

	//@Required
	//@Autowired
	//@Qualifier("CircleRelated")
	@Resource(name="center")
	public void setPoint(Point point) {
		this.point = point;
	}
	
	@PostConstruct
	public void circleInit(){
		System.out.println("Circle Initialization");
	}
	
	@PreDestroy
	public void circleDestroy(){
		System.out.println("Circle Destruction");
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher; 
		
	}


}
