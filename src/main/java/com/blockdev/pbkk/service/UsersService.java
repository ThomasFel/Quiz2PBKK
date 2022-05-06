package com.blockdev.pbkk.service;

import com.blockdev.pbkk.model.Users;
import com.blockdev.pbkk.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends AbstractService<Users, Long> {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    protected JpaRepository<Users, Long> getRepository() {
        return usersRepository;
    }

}
