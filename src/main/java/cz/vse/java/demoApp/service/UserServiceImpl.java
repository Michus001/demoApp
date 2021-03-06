package cz.vse.java.demoApp.service;

import cz.vse.java.demoApp.model.User;
import cz.vse.java.demoApp.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void storeUser(User user) {
        userRepository.saveAndFlush(user);
    }
}
