package com.cts.training.model;

import java.util.List;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.cts.training.model.AddressEntity;
@Component
public class UserEntity implements Serializable {
	private static final long serialVersionUID = -571421626497450456L;
	private int id;
	private String name;
	private String password;
	private List<String> email;
	private long phone;
	private boolean enabled;
	private AddressEntity address;


	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserEntity() {

	}

	public UserEntity(int id, String name, String password, List<String> email, long phone, boolean enabled,AddressEntity address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.address=address;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public void setEmail(List<String> email) {
		this.email = email;
	}
	public List<String>getEmail() {
		return email;
	}


	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", phone="
				+ phone + ", enabled=" + enabled + "]";
	}

}