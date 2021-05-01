package com.machine.coding.atm.entity;
import javax.persistence.*;
import java.util.*;
import com.machine.coding.atm.dao.*;
import com.machine.coding.atm.dao.constants.*;

@Entity
@lombok.Setter
@lombok.Getter
public class Account
{
	@Id
	@GeneratedValue(strategy
			= GenerationType.AUTO)
	int accountId;

	int customerId;
	String accountType;
	Double balanceAmount;
	String encrypedAccountNumber;
	String bankName;

}
