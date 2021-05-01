package com.machine.coding.atm.dao;
import com.machine.coding.atm.dao.*;
import java.util.*;
import com.machine.coding.atm.dao.constants.*;
import com.machine.coding.atm.dao.constants.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class CheckPaymentType extends  PaymentType
{
	@Override
	public PaymentTypes getPaymentTypes(){
		return PaymentTypes.CHECK;
	}
}
