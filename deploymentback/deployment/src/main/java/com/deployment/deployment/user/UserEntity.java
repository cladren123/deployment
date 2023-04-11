package com.deployment.deployment.user;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class UserEntity {

    @Id
    
    private long userSeq;

    private String userIdd;
    private String userPassword;


}
