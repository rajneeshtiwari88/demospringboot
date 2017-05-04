package com.impress.firstTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(@NamedQuery(name = "getEMP", query = "select emp from EntityTest emp group by emp"))
@Entity
@Table(name="EMP")
public class EntityTest {

	public final static String GET_EMP = "getEMP";
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	@Column(name="EMP_NAME",columnDefinition="varchar(25)")
	private String name;
	private String age;
	private int sal;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
