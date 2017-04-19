package springbootscheduleapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String lab;
	@ManyToOne
	private Block block;

	@ManyToOne
	private Course course;
	
	@ManyToOne
	private Professor professor;

	public Section() {
	}

	public Section(String lab, Block block) {
		super();
		this.lab = lab;
		this.block = block;
	}

	public Section(String lab, Block block, Course course) {
		super();
		this.lab = lab;
		this.block = block;
		this.course = course;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

}
