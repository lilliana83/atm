package com.machine.coding.atm.service;

public interface SystemHardwareService
{
	public void printReceipt(com.machine.coding.atm.dao.Customer customer,
			com.machine.coding.atm.dao.TransactionUnit transactionUnit);

	public void loginUser(com.machine.coding.atm.dao.Customer customer);

	public void logOutUser(com.machine.coding.atm.dao.Customer customer);

}
