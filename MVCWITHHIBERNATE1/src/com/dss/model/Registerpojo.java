package com.dss.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Register")
public class Registerpojo 
{     @Id
	  @GeneratedValue
	  @Column(name = "student_id")
	String id;
	public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Column(name = "student_name", nullable = false, length=20)
	String name;
@Column(name = "student_age", nullable = false)
	String age;
@Column(name ="student_gender")
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
