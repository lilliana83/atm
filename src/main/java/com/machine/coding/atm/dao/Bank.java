package com.machine.coding.atm.dao;
import java.util.*;
import com.machine.coding.atm.dao.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class Bank
{
	private String bankName;
	private String ifscCode;
	private String branch;
	private String cityOfBank;
}
