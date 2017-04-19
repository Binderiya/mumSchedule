package springbootscheduleapp.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student extends User{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToMany
	private List<Section> section;
	public Student() {
		
	}
	
	public Student(String advisor) {
		super();
	}

	public List<Section> getSection() {
		return section;
	}

	public void setSection(List<Section> section) {
		this.section = section;
	}
	public Student(String username, String password, List<Section> section) {
		super(username, password);
		this.section = section;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	
}
