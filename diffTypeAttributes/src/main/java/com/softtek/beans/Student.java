package com.softtek.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Student {
	private int id;
	private String Sname;
	private String[] sub;
	private Date JOD;
	private List<Integer> MarksPerSem;
	private LinkedHashMap<String, Integer> CourseFee;
	private Set<String> LibraryBooksBorrowed;
	private Watch watch;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String sname, String[] sub, Date jOD, List<Integer> marksPerSem,
			LinkedHashMap<String, Integer> courseFee, Set<String> libraryBooksBorrowed, Watch watch) {
		super();
		this.id = id;
		Sname = sname;
		this.sub = sub;
		JOD = jOD;
		MarksPerSem = marksPerSem;
		CourseFee = courseFee;
		LibraryBooksBorrowed = libraryBooksBorrowed;
		this.watch = watch;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public void setSub(String[] sub) {
		this.sub = sub;
	}

	public void setJOD(Date jOD) {
		JOD = jOD;
	}

	public void setMarksPerSem(List<Integer> marksPerSem) {
		MarksPerSem = marksPerSem;
	}

	public void setCourseFee(LinkedHashMap<String, Integer> courseFee) {
		CourseFee = courseFee;
	}

	public void setLibraryBooksBorrowed(Set<String> libraryBooksBorrowed) {
		LibraryBooksBorrowed = libraryBooksBorrowed;
	}

	public void setWatch(Watch watch) {
		this.watch = watch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Sname=" + Sname + ", sub=" + Arrays.toString(sub) + ", JOD=" + JOD
				+ ", MarksPerSem=" + MarksPerSem + ", CourseFee=" + CourseFee + ", LibraryBooksBorrowed="
				+ LibraryBooksBorrowed + ", watch=" + watch + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
