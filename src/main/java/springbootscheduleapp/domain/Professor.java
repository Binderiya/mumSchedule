package springbootscheduleapp.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Professor extends User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@ManyToMany
	private List<Course> course;
	
	public Professor(int id, List<Course> course) {
		super();
		this.id = id;
	}

	
	public Professor() {
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
