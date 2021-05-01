package com.machine.coding.atm.dao;
import java.util.*;
import com.machine.coding.atm.dao.*;

@lombok.Getter
@lombok.Setter
@org.springframework.stereotype.Component
public class Card
{
	private String cardNumber;
	private String customerId;
	private String accountId;
	private String encryptedCVV;
	private String cardExpiry;
	private String encryptedPin;
}
