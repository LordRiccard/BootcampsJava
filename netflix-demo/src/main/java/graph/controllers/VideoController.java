package graph.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import graph.domain.models.Video;
import graph.services.VideoService;

@RestController
@RequestMapping("/user")
public class VideoController {

    @Autowired
    private VideoService service;

    @PostMapping
    public ResponseEntity<Video> create (@RequestBody Video video) {
        service.create(video);
        return ResponseEntity.ok(video);
    }

	@GetMapping("/{id}")
	public ResponseEntity<Video> searchById (@PathVariable Integer id) {
		return ResponseEntity.ok(service.findById(id));
	}
    
	@PutMapping("/{id}")
	public ResponseEntity<Video> atualizar(@PathVariable Integer id, @RequestBody Video video) {
		service.update(id, video);
		return ResponseEntity.ok(video);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.ok().build(); 
	}
}
