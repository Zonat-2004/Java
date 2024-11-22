package webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity( name = "Student")
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "StudentId")
	private int id;
	@Column(name="StudentCode")
	private String code;
	
	@ManyToOne
	@JoinColumn(name="classId")
	private Class clazz;
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	
	//@Column (name = "ClassId")
	// short classId;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Email")
	private String email;
	@Column(name="Gender")
	private boolean gender;
	public boolean isGender() {
		return gender;
	}
	//public short getClassId() {
	//	return classId;
	//}
	//public void setClassId(short classId) {
	//	this.classId = classId;
	//}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}