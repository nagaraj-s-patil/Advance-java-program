package com.jsp.TutHibernete_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {

	@Id
	private int questionId;
	private String question;
	
	@OneToOne
	private Answers answers;
	
	
	
	public Answers getAnswers() {
		return answers;
	}
	
	public void setAnswers(Answers answers) {
		this.answers = answers;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + "]";
	}
	
	
	
	
}
