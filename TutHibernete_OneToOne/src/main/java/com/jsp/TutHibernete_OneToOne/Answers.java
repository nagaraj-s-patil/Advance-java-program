package com.jsp.TutHibernete_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answers {

	@Id
	private int answerId;
	private String answer;
	
	@OneToOne(mappedBy = "answers")
	private Questions question;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + "]";
	}
	
	
	
}
