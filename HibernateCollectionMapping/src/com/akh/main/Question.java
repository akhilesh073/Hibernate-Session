package com.akh.main;

import java.util.List;

/**
 * @author akhilesh
 *
 */
public class Question {
	private int id;
	private String qname;
	private List<Answers> answers;
	// Here, List stores the objects of Answer class

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

}