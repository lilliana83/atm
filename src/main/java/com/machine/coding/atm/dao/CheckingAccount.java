package com.machine.coding.atm.dao;
import java.util.*;
import com.machine.coding.atm.dao.*;
import com.machine.coding.atm.dao.constants.*;
import com.machine.coding.atm.dao.constants.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class CheckingAccount extends Account
{
	@Override
	public AccountTypes getAccountType(){
		return AccountTypes.CHECKING;
	}
}
