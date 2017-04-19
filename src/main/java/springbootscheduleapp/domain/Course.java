package springbootscheduleapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String prof;
	
	public Course() {
		
	}
	public Course(String name, String prof) {
		super();
		this.name = name;
		this.prof = prof;
	}
	
	public Course(int id, String name, String prof) {
		super();
		this.id = id;
		this.name = name;
		this.prof = prof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}

}
