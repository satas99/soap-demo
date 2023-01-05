package com.example.soapclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class SoapConfig {

  @Bean
  public Jaxb2Marshaller marshaller() {
    final Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    jaxb2Marshaller.setPackagesToScan("com.example.soapclient.generate");
    return jaxb2Marshaller;
  }

  @Bean
  public WebServiceTemplate template(Jaxb2Marshaller marshaller) {
    return new WebServiceTemplate(marshaller);
  }
}
