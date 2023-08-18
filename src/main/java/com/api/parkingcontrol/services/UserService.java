package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;

public class UserService {

    final UserRepository userRepository;
    public UserService(UserRepository  userRepository){
        this.userRepository = userRepository;
    }
    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public Page<UserModel> findAll(Pageable pageable) {
        return  userRepository.findAll(pageable);
    }

    @Transactional
    public void delete(UserModel userModel) {
        userRepository.delete(userModel);
    }

}
