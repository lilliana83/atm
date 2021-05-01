package com.machine.coding.atm.service;

public interface WithdrawService
{
	public void withdraw(com.machine.coding.atm.dao.Customer customer,
			com.machine.coding.atm.dao.PaymentType paymentType);
}
