package com.test.entity;

import java.io.Serializable;

public class Student implements Serializable {

private static final long serialVersionUID=1L;
private int id;

private String anme;

private String college;

public Student(int id, String anme, String college) {
	super();
	this.id = id;
	this.anme = anme;
	this.college = college;
}

public Student() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAnme() {
	return anme;
}

public void setAnme(String anme) {
	this.anme = anme;
}

public String getCollege() {
	return college;
}

public void setCollege(String college) {
	this.college = college;
}

@Override
public String toString() {
	return String.format("Student [id=%s, anme=%s, college=%s]", id, anme, college);
}


}
