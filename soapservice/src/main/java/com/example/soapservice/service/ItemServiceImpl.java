package com.example.soapservice.service;

import com.example.soapservice.generated.ItemRequest;
import com.example.soapservice.generated.ItemResponse;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemResponse getItem(final ItemRequest itemRequest){
        final ItemResponse itemResponse = new ItemResponse();
        itemResponse.setId(itemRequest.getId());
        itemResponse.setCategory("Sample Category_"+itemRequest.getId());
        itemResponse.setName("Sample ItemName_"+itemRequest.getId());
        return itemResponse;
    }
}