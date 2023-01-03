package Banca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Banca.entity.BankAccount;
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{

}