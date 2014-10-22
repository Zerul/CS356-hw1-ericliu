/*
 * Eric Liu
 * Professor Yu Sun
 * CS 356
 * Homework 1: iClicker
 */
import java.util.UUID;

public class Student {
	
    private int response;
	private String id;
    
	public Student() {
		this.setID(UUID.randomUUID().toString());
	}

	public int getResponse() {
		return response;
	}

	public void setResponse(int response) throws Exception {
		if (response < 0)
			throw new Exception("Answer cannot be negative.");
		this.response = response;
	}
    
	public String getID() {
		return id;
	}

	public void setID(String iD) {
		this.id = iD;
	}
}
