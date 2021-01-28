package com.bbva.us.prime.service.loan.v3.service;

import com.bbva.us.prime.comp.aspect.logging.annotation.EnableLoggingAspect;
import com.bbva.us.prime.comp.exception.provider.manager.ExceptionManager;
import com.bbva.us.prime.dao.loan.credittailor.CreditTailorEntity;
import com.bbva.us.prime.dao.loan.credittailor.repository.CreditTailorRepository;
import com.bbva.us.prime.dao.loan.credittailor.repository.CreditTailorSecuenceRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CreditTailorEntityServiceImpl implements CreditTailorEntityService {

    @Autowired
    CreditTailorRepository creditTailorRepository;

    @Autowired
    CreditTailorSecuenceRepository creditTailorSequenceRepository;

    @EnableLoggingAspect
    @Override
    public CreditTailorEntity saveCreditTailorEntity(CreditTailorEntity creditTailorEntity) {
        return creditTailorRepository.save(creditTailorEntity);

    }

    @Override
    public CreditTailorEntity getCreditTailorByUuid(String ctUuid, String partnerAppId) {
        CreditTailorEntity entity = creditTailorRepository.
                findByCreditTailorIdAndPartnerApplicationId(ctUuid, partnerAppId);

        if (entity == null) {
            log.error("Credit tailor Entity not found");
            throw ExceptionManager.buildResourceNotFoundException("Resource not found", null);
        } else {
            return entity;
        }
    }

    @Override
    public Long generateCTApplicationId() {
        return creditTailorSequenceRepository.getNextSequence();

    }
}