package webapp.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity( name = "Class")
public class Class {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ClassId")
	private short id;
	@Column(name = "ClassCode")
	private String code;
	@Column(name = "ClassName")
	private String name;
	
	@OneToMany(mappedBy="clazz")
	private List<Student> students;
	public List<Student> getStudents(){
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public String getCode() {
		return code;
	}
	public short getId() {
		return id;
	}public String getName() {
		return name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setId(short id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
