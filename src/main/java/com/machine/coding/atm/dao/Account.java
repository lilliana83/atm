package com.machine.coding.atm.dao;
import java.util.*;
import com.machine.coding.atm.dao.*;
import com.machine.coding.atm.dao.constants.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class Account
{
	private String customerId;
	private String accountId;
	private AccountTypes accountType;
	private Balance balance;
	private String encrypedAccountNumber;
	private Bank bank;
}
