package com.springboot.FetchDetailsSOAP.Endpoint;

import com.springboot.FetchDetailsSOAP.Entity.BankDetails;
import com.springboot.FetchDetailsSOAP.Entity.EmploymentDetails;
import com.springboot.FetchDetailsSOAP.Entity.PersonalDetails;
import com.springboot.FetchDetailsSOAP.Service.FetchDetailsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soap.fetchdetails.*;

import java.util.Optional;

@Endpoint
@Component
public class FetchDetailsEndpoint {
    private static final String NAMESPACE_URI = "http://FetchDetails.SOAP";

    @Autowired
    private FetchDetailsService fetchDetailsService;

    public void setFetchDetailsService(FetchDetailsService fetchDetailsService) {
        this.fetchDetailsService = fetchDetailsService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersonalDetailsRequest")
    @ResponsePayload
    public PersonalDetailsResponse getDetails(@RequestPayload PersonalDetailsRequest request) {
        PersonalDetailsResponse response = new PersonalDetailsResponse();
        PersonalDetails personalDetailsEntity = fetchDetailsService.findPersonal(request.getPdId());
        BankDetails bankDetailsEntity = fetchDetailsService.findBank(request.getPdId());
        EmploymentDetails employmentDetailsEntity = fetchDetailsService.findEmployment(request.getPdId());
        Personal personalDetails = new Personal();
        Bank bankDetails = new Bank();
        Employment employmentDetails = new Employment();
        BeanUtils.copyProperties(personalDetailsEntity, personalDetails);
        BeanUtils.copyProperties(bankDetailsEntity, bankDetails);
        BeanUtils.copyProperties(employmentDetailsEntity, employmentDetails);
        response.setPersonalDetails(personalDetails);
        response.setBankDetails(bankDetails);
        response.setEmploymentDetails(employmentDetails);
        return response;
    }
}

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PersonalDetailsRequest")
//    @ResponsePayload
//    public AddPersonalDetailsResponse addPerson(@RequestPayload AddPersonalDetailsRequest addRequest){
//        AddPersonalDetailsResponse addResponse = new AddPersonalDetailsResponse();
//        Personal newPersonal = new Personal();
//        ServiceStatus serviceStatus = new ServiceStatus();
//
//        PersonalDetails newPersonDetails = new PersonalDetails(addRequest.getPdId(),
//                addRequest.getFullname(),
//                addRequest.getDateofbirth(),
//                addRequest.getMobile(),
//                addRequest.getEmail(),
//                addRequest.getCity(),
//                addRequest.getMaritalstatus(),
//                addRequest.getEmploymentDetails(),
//                addRequest.getBankDetails());
//    }
