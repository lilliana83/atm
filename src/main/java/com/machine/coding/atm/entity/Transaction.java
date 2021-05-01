package com.machine.coding.atm.entity;
import java.util.*;

@javax.persistence.Entity
@lombok.Setter
@lombok.Getter
public class Transaction
{
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy
			= javax.persistence.GenerationType.AUTO)
	int transactionId;

	int customerId;
	int accountId;
	Double amount;
	String debitedCredited;
	String paymentType;
	Date timeOfTransaction;

}
