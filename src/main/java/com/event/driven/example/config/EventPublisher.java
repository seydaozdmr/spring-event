package com.event.driven.example.config;

import jakarta.annotation.Nonnull;

public interface EventPublisher<T> {
    void publishEvent(@Nonnull T event);
}
