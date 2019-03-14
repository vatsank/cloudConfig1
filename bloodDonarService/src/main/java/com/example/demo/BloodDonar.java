package com.example.demo;

import javax.persistence.*;

@Entity
@Table( name= "BloodDonor")
public class BloodDonar {

	@Id
	private String donarName;
	private String bloodGroup;
	public BloodDonar() {
		super();
	}
	public BloodDonar(String donarName, String bloodGroup) {
		super();
		this.donarName = donarName;
		this.bloodGroup = bloodGroup;
	}
	public String getDonarName() {
		return donarName;
	}
	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
}
