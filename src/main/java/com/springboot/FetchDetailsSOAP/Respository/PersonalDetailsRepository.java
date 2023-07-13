package com.springboot.FetchDetailsSOAP.Respository;

import com.springboot.FetchDetailsSOAP.Entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Integer> {
}






















//
//    private static final Map<Integer, PersonalDetails> personalDetailsHashMap = new HashMap<>();
//
//    @PostConstruct
//    public void initData(){
//        PersonalDetails pd1 = new PersonalDetails();
//        pd1.setPdId(1);
//        pd1.setFullname("Rudrani Chavarkar");
//        pd1.setEmail("rudranichavarkar26@gmail.com");
//        pd1.setMobile("9819004844");
//        pd1.setCity("Mumbai");
//        pd1.setMaritalstatus("Single");
//
//        EmploymentDetails ed1 = new EmploymentDetails();
//        ed1.setEdId(1);
//        ed1.setCompany("RYC Coop.");
//        ed1.setExperience(4);
//        ed1.setLocation("Mumbai");
//        ed1.setSalary(90000);
//        ed1.setTitle("Intern");
//        ed1.setStartdate("26-05-2023");
//        pd1.setEmploymentDetails(ed1);
//
//        BankDetails bd1 = new BankDetails();
//        bd1.setBdId(1);
//        bd1.setBank("RYC Bank");
//        bd1.setBranch("Vile Parle East");
//        bd1.setAccountnumber(123456789);
//        bd1.setAccounttype("Savings");
//        bd1.setIfscCode("IFSC1234567890");
//        pd1.setBankDetails(bd1);
//
//        personalDetailsHashMap.put(pd1.getPdId(), pd1);
//    }
//
//    public PersonalDetails getDetails(int pdId){
//        Assert.notNull(pdId, "Enter an ID");
//        return personalDetailsHashMap.get(pdId);
//    }
