package com.event.driven.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
public class SpringEventConfig {

    private static final String APPLICATION_EVENT_BEAN = "applicationEventMulticaster";

    @Bean(name = APPLICATION_EVENT_BEAN)
    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
        final var eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
        return eventMulticaster;
    }
}
