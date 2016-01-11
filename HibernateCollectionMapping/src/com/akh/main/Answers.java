package com.akh.main;

/**
 * @author akhilesh
 *
 */
public class Answers {
	private int id;
	private String answer;
	private String posterName;

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public Answers(int id, String answer, String posterName) {
		this.id = id;
		this.answer = answer;
		this.posterName = posterName;
	}

	public Answers() {
		// TODO Auto-generated constructor stub
	}
}