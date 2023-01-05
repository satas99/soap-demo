package com.example.soapservice.service;

import com.example.soapservice.generated.ItemRequest;
import com.example.soapservice.generated.ItemResponse;

public interface ItemService {
    ItemResponse getItem(final ItemRequest itemRequest);
}
