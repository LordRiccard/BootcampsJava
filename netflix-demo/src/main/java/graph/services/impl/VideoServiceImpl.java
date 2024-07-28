package graph.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import graph.domain.models.Video;
import graph.domain.repositories.VideoRepository;
import graph.services.VideoService;

public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoRepository repo;

    @Override
    public void create(Video video) {
        repo.save(video);
    }

    @Override
    public Video findById(Integer id) {
        return repo.findById(id).get();
    }

    @Override
    public void update(Integer id, Video video) {
        repo.save(repo.findById(id).get());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}