package com.github.ronlievens.springboot2.demo.cxf.config;

import com.github.ronlievens.springboot2.demo.cxf.service.CalculatorWebService;
import jakarta.xml.ws.Endpoint;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class WebServiceConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint(final SpringBus springBus) {
        val endpoint = new EndpointImpl(springBus, new CalculatorWebService());
        endpoint.publish("/calculator");
        return endpoint;
    }
}
