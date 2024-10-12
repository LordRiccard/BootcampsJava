package graph.services;

import graph.domain.models.Video;

public interface VideoService {
    void create(Video video);

    Video findById(Integer id);
    
    void update(Integer id, Video video);

    void delete(Integer id);
}
