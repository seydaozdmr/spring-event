package com.event.driven.example.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
public class BaseEvent extends ApplicationEvent {
    private final int resourceId;
    private final OperationType operationType;

    public BaseEvent(final Object source,final int resourceId,final OperationType operationType) {
        super(source);
        this.resourceId = resourceId;
        this.operationType = operationType;
    }


}
