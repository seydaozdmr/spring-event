package com.event.driven.example.data;

public class ProductResourceEvent extends BaseEvent{
    public ProductResourceEvent(final Object source,final int resourceId,final OperationType operationType) {
        super(source, resourceId, operationType);
    }
}
