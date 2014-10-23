/*
 * Eric Liu
 * Professor Yu Sun
 * CS 356
 * Homework 1: iClicker
 */
import java.util.HashMap;

public class ClickerService {
	private int[] counter;
	private HashMap<String, Integer> answers;
	
	public ClickerService() {
		 answers = new HashMap<String, Integer>();
	}
	
	public void addAnswer(Student s) {
		if (answers.put(s.getID(), s.getResponse()) == null)
			counter[s.getResponse()]++; 
	}

    public void formatQuestion(Question q) {
    	System.out.println(q.getQuestion());
    	counter = new int[q.getAnswerScheme().length];
    	for (int x = 0; x < q.getAnswerScheme().length; x++) {
    		System.out.println(q.getAnswerScheme()[x]);
    	}
    }
    
    public void getAnswerCount(Question q) {
    	for (int x = 0; x < q.getAnswerScheme().length; x++) {
    		System.out.println(q.getAnswerScheme()[x] +  ": " + counter[x]);
    	}
    }
    
    public void reset() {
    	counter = null;
    	answers.clear();
    }
}
