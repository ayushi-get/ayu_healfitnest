package com.example.HealFitNest.Model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "RegisteredUsers")

public class Users {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long contact;

}
