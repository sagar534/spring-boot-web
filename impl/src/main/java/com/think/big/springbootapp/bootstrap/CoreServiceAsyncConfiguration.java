package com.think.big.springbootapp.bootstrap;

import com.think.big.springbootapp.util.ApplicationAsyncExecutor;
import com.think.big.springbootapp.util.ApplicationAsyncExecutorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;


@Configuration
public class CoreServiceAsyncConfiguration {

    private static final String THREAD_PREFIX = "core-service-executor-";
    public static ApplicationAsyncExecutor SERVICE_EXECUTOR;

    @Bean
    public ApplicationAsyncExecutor coreServiceApplicationAsyncExecutor(ApplicationAsyncExecutorFactory applicationAsyncExecutorFactory) {
        SERVICE_EXECUTOR = applicationAsyncExecutorFactory.build(THREAD_PREFIX);
        return SERVICE_EXECUTOR;
    }
    @Bean
    public Integer applicationExecutorPoolSize() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 2) * 8;
    }
}
