package graph.services;

import graph.domain.models.WatchedByUser;

public interface WatchedByUserService {
    void create(WatchedByUser watched);

    WatchedByUser findById(Integer id);

    void update(Integer id, WatchedByUser watched);

    void delete(Integer id);
}