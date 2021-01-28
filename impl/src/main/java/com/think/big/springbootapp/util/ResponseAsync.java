package com.think.big.springbootapp.util;

import com.think.big.springbootapp.bootstrap.CoreServiceAsyncConfiguration;
import lombok.experimental.UtilityClass;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@UtilityClass
public class ResponseAsync {
    public static <T extends Response<?>> CompletableFuture<T> supplyAsync(Supplier<T> supplier) {
        return CompletableFuture.supplyAsync(supplier, CoreServiceAsyncConfiguration.SERVICE_EXECUTOR);
    }
}
