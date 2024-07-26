package graph.services;

import graph.domain.models.User;

public interface UserService {
    User findById(Integer id);

    void create(User user);
}
