package com.springboot.FetchDetailsSOAP.Respository;

import com.springboot.FetchDetailsSOAP.Entity.EmploymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentDetailsRepository extends JpaRepository<EmploymentDetails, Integer> {
}
