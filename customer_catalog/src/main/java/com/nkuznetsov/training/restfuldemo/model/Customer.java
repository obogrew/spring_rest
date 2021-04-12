package com.nkuznetsov.training.restfuldemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	
	@OneToMany(mappedBy = "customer")

	private final List<Characteristic> characteristics = new ArrayList<Characteristic>();
    
	public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
