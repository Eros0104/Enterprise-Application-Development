package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")
@SequenceGenerator(name = "customer", sequenceName = "SQ_T_CUSTOMER", allocationSize = 1)
public class Customer {
	@Id
	@Column(name = "id_customer")
	@GeneratedValue(generator = "customer", strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "nm_customer", nullable = false)
	private String name;
	
	@Column(name = "dt_birthday")
	private Calendar birthdayDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_gender")
	private Gender gender;
	
	@Column(name="ft_profile")
	private byte[] profilePicture;

	public Customer(String name, Calendar birthdayDate, Gender gender, byte[] profilePicture) {
		super();
		this.name = name;
		this.birthdayDate = birthdayDate;
		this.gender = gender;
		this.profilePicture = profilePicture;
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

	public Calendar getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(Calendar birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}
	

}
