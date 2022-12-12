package com.management.usermanagement.user.infrastructure.dto;

import com.management.usermanagement.base.BaseEntity;
import com.management.usermanagement.config.BaseDTO;
import com.management.usermanagement.config.ModuleMapper;
import com.management.usermanagement.user.infrastructure.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

@Component
@RequiredArgsConstructor
public abstract class Mapper<E extends BaseEntity<Long>, D extends BaseDTO> {
    private final ModuleMapper map;
    private D d;
    private E e;

    public D ConvertToDto(E e) {
        return map.modelMapper().map(e, (Type) d.getClass());
    }


    public E convertToEntity(D e) {
        return map.modelMapper().map(d, (Type) e.getClass());
    }
}
