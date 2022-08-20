package com.samples.S01springcoredi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;
	public Patient() {
		System.out.println("Inside patient constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the setter method for ID field");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void methodone() {
		System.out.println("Inside methodone");
	}

	@PreDestroy
	public void methodtwo() {
		System.out.println("Inside methodtwo");
	}


}
