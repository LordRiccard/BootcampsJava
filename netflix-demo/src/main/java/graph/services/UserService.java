package graph.services;

import graph.domain.models.User;

public interface UserService {
    void create(User user);

    User findById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);
}
