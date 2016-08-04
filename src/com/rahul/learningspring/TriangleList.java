package com.rahul.learningspring;

import java.util.List;

public class TriangleList {

	private List<Point> points;

	public void draw() {
		// System.out.println("Type: " + type);
		// System.out.println("Height: " + height);
		// System.out.println("Drawing Triangle!");
		for (Point point : points)
			System.out.println("Point a: x = " + point.getX() + ", y = " + point.getY());
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
