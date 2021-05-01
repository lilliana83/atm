package com.machine.coding.atm.dao;
import com.machine.coding.atm.dao.*;
import java.util.*;
import com.machine.coding.atm.dao.constants.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class PaymentType
{
	private TransactionUnit transactionUnit;
	private Transaction transaction;
	private String customerId;
	private PaymentTypes paymentTypes;
}
