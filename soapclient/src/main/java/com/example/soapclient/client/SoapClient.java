package com.example.soapclient.client;

import com.example.soapclient.generate.ItemResponse;

public interface SoapClient {
    ItemResponse getItemInfo(final int id);
}
