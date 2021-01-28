package com.bbva.us.prime.dao.loan.credittailor.repository;

import com.bbva.us.prime.dao.loan.credittailor.CreditTailorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CreditTailorRepository extends MongoRepository<CreditTailorEntity, String> {

    @Query("{ '_id' : ?0, 'partner.applicationId' : ?1 }")
    CreditTailorEntity findByCreditTailorIdAndPartnerApplicationId(String creditTailorId, String partnerApplicationId);

    @Query("{ 'creditDecision.expirationDate' : { $lte : ?0}, 'creditDecision.isExpired' : ?1 }")
    public List<CreditTailorEntity> findByCreditDecisionExpirationDateAndCreditDecisionIsExpired(String expirationDate, Boolean flag);

}
