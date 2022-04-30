package com.examServer.entity.xam;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qid;
	private String title;
	private String description;
	private int maxMarks;
	private String noOfQuestions;
	private boolean active = false;
	
	@ManyToOne
	private Category category;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exam", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Question> question = new HashSet<>();
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(String title, String description, int maxMarks, String noOfQuestions, boolean active) {
		super();
		this.title = title;
		this.description = description;
		this.maxMarks = maxMarks;
		this.noOfQuestions = noOfQuestions;
		this.active = active;
	}

	public Long getQid() {
		return qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(String noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
