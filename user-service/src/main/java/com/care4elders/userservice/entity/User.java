package com.care4elders.userservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
<<<<<<< HEAD

=======
    public String phoneNumber;
    private Role role;
>>>>>>> 03747c0ae9375dfcdf6de240e7dc021ce6901d4d
}
