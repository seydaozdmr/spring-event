package com.event.driven.example.service;

import com.event.driven.example.data.ProductResourceEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductEventService {

    @EventListener(condition = "#productResourceEvent.operationType.name() == 'CREATED'")
    public void onProductAdded(final ProductResourceEvent productResourceEvent){
        log.info("Product Added {}",productResourceEvent.getResourceId());
    }
}
