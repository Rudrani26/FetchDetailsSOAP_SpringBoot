package com.springboot.FetchDetailsSOAP.Respository;

import com.springboot.FetchDetailsSOAP.Entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer> {
}
