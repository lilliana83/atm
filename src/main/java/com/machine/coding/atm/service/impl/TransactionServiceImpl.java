package com.machine.coding.atm.service.impl;
import com.machine.coding.atm.dao.*;
import java.util.*;
import com.machine.coding.atm.service.*;

@org.springframework.stereotype.Component
public class TransactionServiceImpl implements TrasanctionService
{

	@Override public com.machine.coding.atm.dao.TransactionUnit balanceEnquiry(
			com.machine.coding.atm.dao.Customer customer)
	{
		return null;
	}

	@Override public void transferAmount(
			com.machine.coding.atm.dao.PaymentType payment,
			com.machine.coding.atm.dao.Account transferFrom,
			com.machine.coding.atm.dao.Account transferTo,
			com.machine.coding.atm.dao.Customer customer)
	{

	}
}
