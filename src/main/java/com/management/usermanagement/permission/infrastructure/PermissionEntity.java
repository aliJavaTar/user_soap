package com.management.usermanagement.permission.infrastructure;

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
public class PermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

}
