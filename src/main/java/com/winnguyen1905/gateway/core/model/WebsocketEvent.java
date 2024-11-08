package com.winnguyen1905.gateway.core.model;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsocketEvent extends AbstractModel {
    String message;
    String eventType;
    String eventSubType;
}