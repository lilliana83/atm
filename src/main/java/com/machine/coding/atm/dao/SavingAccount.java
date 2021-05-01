package com.machine.coding.atm.dao;
import java.util.*;
import com.machine.coding.atm.dao.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class SavingAccount extends Account
{
	@Override
	public com.machine.coding.atm.dao.constants.AccountTypes getAccountType(){
		return com.machine.coding.atm.dao.constants.AccountTypes.SAVINGS;
	}
}
