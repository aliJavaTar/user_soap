package com.management.usermanagement.base.infra.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.management.usermanagement")
public class ModuleMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


}
