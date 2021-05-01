package com.machine.coding.atm.entity;

@javax.persistence.Entity
@lombok.Setter
@lombok.Getter
public class Customer
{
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy
			= javax.persistence.GenerationType.AUTO)
	int customerId;

	String firstName;
	String lastName;

}
