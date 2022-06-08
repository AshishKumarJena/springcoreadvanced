package com.ashish.spring.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {

	@Value("10")
	private int id;
	@Value("Ashish Kumar Jena")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}

}
