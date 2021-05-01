package com.machine.coding.atm.service;
import com.machine.coding.atm.dao.*;
import java.util.*;
public interface TrasanctionService
{
		public TransactionUnit balanceEnquiry(Customer customer);
		public void transferAmount(PaymentType payment, Account transferFrom, Account transferTo, Customer customer);
}
