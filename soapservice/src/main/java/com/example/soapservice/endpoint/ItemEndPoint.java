package com.example.soapservice.endpoint;

import com.example.soapservice.generated.ItemRequest;
import com.example.soapservice.generated.ItemResponse;
import com.example.soapservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class ItemEndPoint {
    private static final String NAME_SPACE = "http://example.com/soapservice/generated";
    private final ItemService itemService;

    @PayloadRoot(namespace = NAME_SPACE, localPart = "ItemRequest")
    @ResponsePayload
    public ItemResponse getItem(@RequestPayload ItemRequest itemRequest){
        return itemService.getItem(itemRequest);
    }
}