/*
 * Eric Liu
 * Professor Yu Sun
 * CS 356
 * Homework 1: iClicker
 */
public class SampleMultipleChoiceQuestion implements Question {

	private String question;
	private String[] answerScheme = {"A", "B", "C", "D"};
	
	public SampleMultipleChoiceQuestion(String question) {
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
