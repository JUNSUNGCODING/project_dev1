package com.seb39.pre32.MyStackOverFlow.users.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "pw")
    private String userPw;

    @Column(name = "reputation")
    private long reputation;

    @Column(name = "created_at")
    private String userCreateAt;

    @Column(name = "modified_at")
    private String userModifiedAt;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "status")
    private String status;


}
