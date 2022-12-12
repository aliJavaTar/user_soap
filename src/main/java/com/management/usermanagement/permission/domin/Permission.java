package com.management.usermanagement.permission.domin;

public record Permission(Long id, String title) {

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
