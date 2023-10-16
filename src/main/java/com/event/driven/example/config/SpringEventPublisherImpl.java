package com.event.driven.example.config;

import jakarta.annotation.Nonnull;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringEventPublisherImpl implements EventPublisher<ApplicationEvent>{

    private final ApplicationEventPublisher applicationEventPublisher;

    public SpringEventPublisherImpl(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publishEvent(@Nonnull final ApplicationEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
