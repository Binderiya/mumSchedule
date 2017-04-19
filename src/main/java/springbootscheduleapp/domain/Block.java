package springbootscheduleapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Block {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String name;
	@ManyToOne
	private Entry entry;
	
	public Block() {
	
	}
	public Block(String name) {
		super();
		this.name = name;
	}
	public Block(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Block(String name, Entry entry) {
		super();
		this.name = name;
		this.entry = entry;
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

}
