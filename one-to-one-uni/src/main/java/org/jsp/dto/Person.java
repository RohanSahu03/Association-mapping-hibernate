package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


//@NamedQueries({
//	@NamedQuery(name="findAll",query="select p from Person p"),
//	@NamedQuery(name="findByName",query="select p from Person p where p.name=?1"),
//	@NamedQuery(name="findByPhone",query="select p from Person p where p.phone=?1"),
//	@NamedQuery(name="findByPhone&Password",query="select p from Person p where p.phone=?1 and p.password=?2")
//	
//})
@Entity
public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
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

	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Person(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	private String name;
	private long phone;
	
	@OneToOne(cascade=CascadeType.ALL)
	private AadharCard card;
	public AadharCard getCard() {
		return card;
	}
	public void setCard(AadharCard card) {
		this.card = card;
	}
	

}
