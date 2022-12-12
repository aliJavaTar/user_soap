package com.management.usermanagement.permission.infrastructure;

import com.management.usermanagement.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PERMISSION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PermissionEntity extends BaseEntity<Long> {

    @Column(name = "TITLE")
    private String title;

}
