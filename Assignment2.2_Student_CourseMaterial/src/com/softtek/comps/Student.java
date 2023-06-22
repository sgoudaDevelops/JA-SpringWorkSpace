package com.softtek.comps;

public class Student {
	private CourseMaterial course;

	public void setCourse(CourseMaterial course) {
		this.course = course;
	}
	public void coursedet()
	{ 
		String course2 = course.Course();
		System.out.println(course2);
		
	}
	

}
