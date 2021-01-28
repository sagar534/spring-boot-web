package com.bbva.us.prime.service.loan.v3.service;

import com.bbva.us.prime.dao.loan.credittailor.CreditTailorEntity;

public interface CreditTailorEntityService {

    CreditTailorEntity getCreditTailorByUuid(String ctUuid, String partnerId);

    CreditTailorEntity saveCreditTailorEntity(CreditTailorEntity creditTailorEntity);

    Long generateCTApplicationId();
}