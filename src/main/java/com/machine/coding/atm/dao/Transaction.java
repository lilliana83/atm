package com.machine.coding.atm.dao;
import java.util.*;
import com.machine.coding.atm.dao.constants.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class Transaction
{
	private String transactionId;
	private TransactionUnit transactionUnit;
	private String customerId;
	private Date transactionTime;
	private TransactionTypes transactionTypes;
}
