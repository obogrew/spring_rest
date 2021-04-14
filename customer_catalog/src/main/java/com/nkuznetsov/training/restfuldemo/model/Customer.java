package com.nkuznetsov.training.restfuldemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
public class Customer {
	@Id
    @GeneratedValue
	@Getter
	@Setter
	private Long customerId;
	
	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	private String lastName;
	
	@Getter
	@Setter
	private Date birthDate;

	
	@OneToMany(mappedBy = "customer",        cascade = CascadeType.ALL)
	private  List<Characteristic> characteristics = new ArrayList<Characteristic>();
	
	public void addCharacteristic(Characteristic characteristic) {
		 	characteristics.add(characteristic);
		 	characteristic.setCustomer(this);
	}
	 
	public void removeCharacteristic(Characteristic characteristic) {
	    	characteristics.remove(characteristic);
	    	characteristic.setCustomer(null);
	}
	
	public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
