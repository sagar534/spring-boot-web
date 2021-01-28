package com.think.big.springbootapp.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public final class ApplicationAsyncExecutor extends ThreadPoolTaskExecutor {
    private static final Logger log = LogManager.getLogger(ApplicationAsyncExecutor.class);

    public ApplicationAsyncExecutor() {
    }
}
