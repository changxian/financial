package cx.rcd.financial.redis;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private Integer age;
	private Date date;
	
	public Person() {
		super();
	}
	public Person(String id, String name, Integer age, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
