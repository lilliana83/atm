package com.machine.coding.atm.repository;
import com.machine.coding.atm.entity.*;
import javax.persistence.*;
import org.springframework.stereotype.*;
import org.springframework.data.repository.*;
import java.util.*;

@org.springframework.stereotype.Repository
public interface TransactionRepository extends CrudRepository<com.machine.coding.atm.entity.Transaction,
		Integer>
{
	/**@Query(
			value = "SELECT * FROM Users ORDER BY id \n-- #pageable\n",
			countQuery = "SELECT count(*) FROM Users",
			nativeQuery = true)
	Transaction findTransactionByUser (Customer customer);**/

}
