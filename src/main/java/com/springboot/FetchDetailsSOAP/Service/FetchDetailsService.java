package com.springboot.FetchDetailsSOAP.Service;

import com.springboot.FetchDetailsSOAP.Entity.BankDetails;
import com.springboot.FetchDetailsSOAP.Entity.EmploymentDetails;
import com.springboot.FetchDetailsSOAP.Entity.PersonalDetails;

import java.util.Optional;

public interface FetchDetailsService {

    PersonalDetails savePerson(PersonalDetails personalDetails);

    PersonalDetails findPersonal(int pdId);

    BankDetails findBank(int bd_id);

    EmploymentDetails findEmployment(int ed_id);

//    void getAllbyID(int id);

}
