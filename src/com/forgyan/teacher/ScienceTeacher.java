package com.forgyan.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.forgyan.coach.Coach;
@Component
public class ScienceTeacher implements Teacher {
	@Autowired
	private Coach coach;
	
	 public ScienceTeacher(Coach coach) {
		this.coach = coach;
	}

	@Override
	public String teach() {
		return "Chemistry, Biology & Physics is part of Science";
	}

	@Override
	public String train() {
		return coach.train();
	}

}
