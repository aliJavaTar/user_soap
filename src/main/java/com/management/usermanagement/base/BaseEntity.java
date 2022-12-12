package com.management.usermanagement.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public class BaseEntity<ID extends Serializable>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ID id;

    public ID getId() {
        return id;
    }
}
