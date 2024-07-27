package graph.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import graph.domain.models.User;
import graph.domain.repositories.UserRepository;
import graph.services.UserService;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repo;

    @Override
    public void create(User user) {
        repo.save(user);
    }
    
    @Override
    public User findById(Integer id) {
        return repo.findById(id).get();
    }

    
}
