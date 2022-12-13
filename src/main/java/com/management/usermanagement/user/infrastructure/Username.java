package com.management.usermanagement.user.infrastructure;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Username {
    private String username;
}
