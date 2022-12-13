package com.management.usermanagement.user.infrastructure.dto.respons;

import com.management.usermanagement.role.domain.Role;
import com.management.usermanagement.user.infrastructure.Username;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse implements Serializable {
    private Username username;
    private String nationalID;
    private Role role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse that = (UserResponse) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(nationalID, that.nationalID) &&
                Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, nationalID, role);
    }
}
