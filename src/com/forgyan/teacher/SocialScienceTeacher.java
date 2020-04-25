package com.forgyan.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.forgyan.coach.Coach;
@Component
public class SocialScienceTeacher implements Teacher {
	@Autowired
	private Coach coach;
	private String name;
	private String qualification;

	@Override
	public String teach() {
		return "Social knowledge is most important";
	}

	@Override
	public String train() {
		return coach.train();
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		System.out.println("SocialScienceTeacher : setCoach method called");
		this.coach = coach;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("SocialScienceTeacher : setName method called");
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		System.out.println("SocialScienceTeacher : setQualification method called");
		this.qualification = qualification;
	}
	
	

}
