package com.nkuznetsov.training.restfuldemo.model;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Characteristic {
	
	@Id
    @GeneratedValue
    @Getter
	@Setter
    private Long charId;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Getter
	@Setter
	private String characteristicsName;
	
	@Getter
	@Setter
	private String CharacteristicsValue;
	
	
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
