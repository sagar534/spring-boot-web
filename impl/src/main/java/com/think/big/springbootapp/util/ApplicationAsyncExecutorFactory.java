package com.think.big.springbootapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationAsyncExecutorFactory {
    @Autowired
    Integer applicationExecutorPoolSize;

    public ApplicationAsyncExecutorFactory() {
    }

    public ApplicationAsyncExecutor build(String threadNamePrefix) {
        ApplicationAsyncExecutor applicationAsyncExecutor = new ApplicationAsyncExecutor();
        applicationAsyncExecutor.setTaskDecorator(new MdcTaskDecorator());
        applicationAsyncExecutor.setCorePoolSize(this.applicationExecutorPoolSize);
        applicationAsyncExecutor.setThreadNamePrefix(threadNamePrefix);
        return applicationAsyncExecutor;
    }
}
