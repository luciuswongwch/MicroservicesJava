package com.luciuswong.accounts.repository;

import com.luciuswong.accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByCustomerCustomerId(int customerId);
}
