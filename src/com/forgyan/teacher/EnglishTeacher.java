package com.forgyan.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.forgyan.coach.Coach;
@Component
public class EnglishTeacher implements Teacher {
	@Autowired
	private Coach coach;
	
	public EnglishTeacher() {
		System.out.println("EnglishTeacher : inside no-args constructor");
	}
	
	public void setCoach(Coach coach) {
		System.out.println("EnglishTeacher : inside setter method");
		this.coach=coach;
	}

	@Override
	public String teach() {
		return "Knowlede ofTense is Very important, for speaking english";
	}

	@Override
	public String train() {
		return coach.train();
	}

}
