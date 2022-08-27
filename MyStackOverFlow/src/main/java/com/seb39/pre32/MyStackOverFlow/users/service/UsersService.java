package com.seb39.pre32.MyStackOverFlow.users.service;

import com.seb39.pre32.MyStackOverFlow.exception.BusinessLogicException;
import com.seb39.pre32.MyStackOverFlow.exception.ExceptionCode;
import com.seb39.pre32.MyStackOverFlow.users.entity.Users;
import com.seb39.pre32.MyStackOverFlow.users.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    private final UsersRepository usersRepository;


    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users createUser(Users users){
        Users saveUsers = usersRepository.save(users);

        return saveUsers;
    }

//    public Users updateUser(Users users){
//        return usersRepository.save(users);
//    }

    public Users findUser(long usersId){
        return findverifiedUser(usersId);
    }

    public Users findverifiedUser(long usersId){
        Optional<Users> optionalUser =
            usersRepository.findById(usersId);

        Users findUser =
            optionalUser.orElseThrow(() -> new BusinessLogicException(ExceptionCode.USER_NOT_FOUND));
        return findUser;
    }
}
