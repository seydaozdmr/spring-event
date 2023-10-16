package com.event.driven.example.service;

import com.event.driven.example.config.EventPublisher;
import com.event.driven.example.data.OperationType;
import com.event.driven.example.data.ProductResourceEvent;
import com.event.driven.example.model.Product;
import com.event.driven.example.repository.ProductRepository;
import jakarta.annotation.Nonnull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    private final EventPublisher<ApplicationEvent> eventPublisher;

    public ProductService(ProductRepository productRepository, EventPublisher<ApplicationEvent> eventPublisher) {
        this.productRepository = productRepository;
        this.eventPublisher = eventPublisher;
    }

    @Transactional
    public Product createProduct(@Nonnull final Product product){
        final var productModel = productRepository.save(product);


        eventPublisher.publishEvent(new ProductResourceEvent(this, Math.toIntExact(productModel.getId()), OperationType.CREATED));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("execution done");

        return productModel;
    }
}
