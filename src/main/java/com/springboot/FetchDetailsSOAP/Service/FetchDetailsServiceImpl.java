package com.springboot.FetchDetailsSOAP.Service;

import com.springboot.FetchDetailsSOAP.Entity.BankDetails;
import com.springboot.FetchDetailsSOAP.Entity.EmploymentDetails;
import com.springboot.FetchDetailsSOAP.Entity.PersonalDetails;
import com.springboot.FetchDetailsSOAP.Respository.BankDetailsRepository;
import com.springboot.FetchDetailsSOAP.Respository.EmploymentDetailsRepository;
import com.springboot.FetchDetailsSOAP.Respository.PersonalDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soap.fetchdetails.Bank;

import java.util.Optional;

@Service
public class FetchDetailsServiceImpl implements FetchDetailsService {

    @Autowired
    private PersonalDetailsRepository personalDetailsRepository;
    @Autowired
    private BankDetailsRepository bankDetailsRepository;
    @Autowired
    private EmploymentDetailsRepository employmentDetailsRepository;

    @Override
    public PersonalDetails savePerson(PersonalDetails personalDetails) {
        BankDetails bankDetails = personalDetails.getBankDetails();
        EmploymentDetails employmentDetails = personalDetails.getEmploymentDetails();
        return personalDetailsRepository.save(personalDetails);
    }

    @Override
    public PersonalDetails findPersonal(int pdId) {
        return personalDetailsRepository.findById(pdId).get();
    }

    @Override
    public BankDetails findBank(int bd_id) {
        return bankDetailsRepository.findById(bd_id).get();
    }

    @Override
    public EmploymentDetails findEmployment(int ed_id) {
        return employmentDetailsRepository.findById(ed_id).get();
    }


//    @Override
//    public void getAllbyID(int id) {
//        PersonalDetails pd = personalDetailsRepository.findById(id).get();
//        BankDetails bd = bankDetailsRepository.findById(id).get();
//        EmploymentDetails ed = employmentDetailsRepository.findById(id).get();
//    }


}