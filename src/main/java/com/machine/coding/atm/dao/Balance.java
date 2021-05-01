package com.machine.coding.atm.dao;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class Balance
{
	private Double balanceAmount;
	private Boolean isMinimumBalance;
}
