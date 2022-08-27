package com.seb39.pre32.MyStackOverFlow.users.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;


public class UsersDto {
    @Getter
    @AllArgsConstructor
    public static class Post{
        private String email;
        private String userPw;
        private long reputation;
        //private String userCreateAt;
        //private String userModifiedAt;
        private String nickName;
        private String status;

    }
    @Getter
    @AllArgsConstructor
    public static class Patch{
        private long userId;
        private String email;
        private String userPw;
        private long reputation;
        private String userCreateAt;
        private String userModifiedAt;
        private String nickName;
        private String status;

    }

    @Getter
    @AllArgsConstructor
    public static class Response{
        private long userId;
        private String email;
        private String userPw;
        private long reputation;
        private String userCreateAt;
        private String userModifiedAt;
        private String nickName;
        private String status;

    }
}
