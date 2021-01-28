package com.think.big.springbootapp.repository;

import com.think.big.springbootapp.domain.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

    @Query("{ '_id' : ?0, 'partner.applicationId' : ?1 }")
    CustomerEntity findByCreditTailorIdAndPartnerApplicationId(String creditTailorId, String partnerApplicationId);

    @Query("{ 'residence.residenceType' : { $lte : ?0}, 'lastName' : ?1 }")
    public List<CustomerEntity> findByCreditDecisionExpirationDateAndCreditDecisionIsExpired(String city, Boolean lastName);

}
