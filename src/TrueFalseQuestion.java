/*
 * Eric Liu
 * Professor Yu Sun
 * CS 356
 * Homework 1: iClicker
 */
public class TrueFalseQuestion implements Question {
	private String question;
	private String[] answerScheme = {"True", "False"};
	
	public TrueFalseQuestion(String question) {
		this.setQuestion(question);
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String[] getAnswerScheme() {
		return answerScheme;
	}
}
