package graph.services.impl;

import graph.domain.models.Video;

public interface VideoService {
    Video findById(Integer id);

    void create(Video video);
}
