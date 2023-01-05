package com.example.soapclient.controller;

import com.example.soapclient.client.SoapClientImpl;
import com.example.soapclient.generate.ItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final SoapClientImpl soapClient;

    @GetMapping("/{id}")
    public ItemResponse item(@PathVariable final int id){
        return soapClient.getItemInfo(id);
    }
}
