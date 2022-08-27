package com.seb39.pre32.MyStackOverFlow.users.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserSResponseDto {
    private long userId;
    private String email;
    private String userPw;
    private long reputation;
    private String userCreateAt;
    private String userModifiedAt;
    private String nickName;
    private boolean status;
}
