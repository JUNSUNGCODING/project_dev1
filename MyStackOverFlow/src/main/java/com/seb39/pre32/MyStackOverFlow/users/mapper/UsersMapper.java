package com.seb39.pre32.MyStackOverFlow.users.mapper;

import com.seb39.pre32.MyStackOverFlow.users.dto.UsersDto;
import com.seb39.pre32.MyStackOverFlow.users.entity.Users;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsersMapper {
    Users usersPostToUser(UsersDto.Post requestBody);
    Users usersPatchToUser(UsersDto.Patch requestBody);
    UsersDto.Response userToUserResponse(Users user);
}
