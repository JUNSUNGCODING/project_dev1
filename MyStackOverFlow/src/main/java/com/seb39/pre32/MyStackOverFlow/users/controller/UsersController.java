package com.seb39.pre32.MyStackOverFlow.users.controller;

import com.seb39.pre32.MyStackOverFlow.dto.SingleResponseDto;
import com.seb39.pre32.MyStackOverFlow.users.dto.UsersDto;
import com.seb39.pre32.MyStackOverFlow.users.entity.Users;
import com.seb39.pre32.MyStackOverFlow.users.mapper.UsersMapper;
import com.seb39.pre32.MyStackOverFlow.users.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;


@RestController
@RequestMapping("/api/users")
@Validated
@Slf4j
public class UsersController {
    private final UsersService usersService;
    private final UsersMapper mapper;

    public UsersController(UsersService usersService, UsersMapper mapper) {
        this.usersService = usersService;
        this.mapper = mapper;
    }

    @PostMapping("/signup/basic")
    public ResponseEntity postUsers(@Valid @RequestBody UsersDto.Post requestBody){
        Users user = mapper.usersPostToUser(requestBody);
        Users createdUser = usersService.createUser(user);
        UsersDto.Response response = mapper.userToUserResponse(createdUser);
        return new ResponseEntity<>(
                new SingleResponseDto<>(response),
                HttpStatus.CREATED);
    }


    @GetMapping("/login/basic/{user-id}")
    public ResponseEntity getUser(
            @PathVariable("user-id") @Positive long userId) {
        Users user = usersService.findUser(userId);
        return new ResponseEntity<>(
                new SingleResponseDto<>(mapper.userToUserResponse(user))
                , HttpStatus.OK);
    }
}
