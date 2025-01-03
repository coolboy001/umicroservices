package com.avm.account.repositories;

import com.avm.account.entities.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);
    Optional<Accounts> findByAccountNumber(Long customerId);

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}
