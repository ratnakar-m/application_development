package com.bonhive.pmtool.configurations;

import com.bonhive.pmtool.demo.Car;
import com.bonhive.pmtool.demo.Etios;
import com.bonhive.pmtool.demo.Swift;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansFactory {

    @Value("${spring.car}")
    private String carModel;

    @Bean
    public Car autowiredCar() {
        Car car = null;
        System.out.println("#################Car Model:################# "+carModel);
        if(carModel.equalsIgnoreCase("swift"))
            return new Swift();
        else
            return new Etios();
    }
}
