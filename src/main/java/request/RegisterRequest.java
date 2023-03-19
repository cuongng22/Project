package request;

import lombok.Data;

@Data
public class RegisterRequest {
    String username;

    String password;

    String passwordConfirm;
}
