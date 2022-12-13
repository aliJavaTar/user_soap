package com.management.usermanagement.base.infra.config;

import org.modelmapper.ModelMapper;


public class Mapper {
    private static final ModelMapper mapper;

    static {
        mapper = new ModelMapper();
    }


    public static ModelMapper getMapper() {
        return mapper;
    }
}
