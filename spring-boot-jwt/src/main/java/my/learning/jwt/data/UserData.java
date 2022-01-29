package my.learning.jwt.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class UserData implements Serializable {
    private String userName;
    private String password;
}