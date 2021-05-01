package com.machine.coding.atm.service;
import com.machine.coding.atm.dao.*;
import java.util.*;
public interface DepositService
{
	public void deposit(Customer customer, PaymentType paymentType);
}
