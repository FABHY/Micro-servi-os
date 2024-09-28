package com.ms.user.services;


import com.ms.user.models.UserModel;
import com.ms.user.repositories.Userrepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    final
    Userrepository userrepository;

    public UserService(Userrepository userrepository) {
        this.userrepository = userrepository;
    }
    @Transactional
    public UserModel save(UserModel userModel){
        return userrepository.save(userModel);
    }

}
