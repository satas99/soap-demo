package com.example.soapclient.client;

import com.example.soapclient.generate.ItemRequest;
import com.example.soapclient.generate.ItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class SoapClientImpl implements SoapClient {
  private final WebServiceTemplate template;

  @Override
  public ItemResponse getItemInfo(int id) {
    final ItemRequest itemRequest = new ItemRequest();
    itemRequest.setId(id);
    return (ItemResponse) template.marshalSendAndReceive("http://localhost:8080/ws", itemRequest);
  }
}
