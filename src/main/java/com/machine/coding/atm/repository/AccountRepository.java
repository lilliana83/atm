package com.machine.coding.atm.repository;

@org.springframework.stereotype.Repository
public interface AccountRepository
		extends org.springframework.data.repository.CrudRepository<com.machine.coding.atm.entity.Account,
		Integer>
{

}
