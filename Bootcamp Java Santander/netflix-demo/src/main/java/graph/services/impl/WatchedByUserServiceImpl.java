package graph.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import graph.domain.models.WatchedByUser;
import graph.domain.repositories.WatchedByUserRepository;
import graph.services.WatchedByUserService;

public class WatchedByUserServiceImpl implements WatchedByUserService {
    @Autowired
    private WatchedByUserRepository repo;

    @Override
    public void create(WatchedByUser watched) {
        repo.save(watched);
    }

    @Override
    public WatchedByUser findById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public void update(Integer id, WatchedByUser watched) {
        repo.save(repo.findById(id).get());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}