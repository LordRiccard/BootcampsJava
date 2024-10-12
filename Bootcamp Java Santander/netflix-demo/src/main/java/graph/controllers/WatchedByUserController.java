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

import graph.domain.models.WatchedByUser;
import graph.services.WatchedByUserService;

@RestController
@RequestMapping("/watched")
public class WatchedByUserController {

    @Autowired
    private WatchedByUserService service;

    @PostMapping
    public ResponseEntity<WatchedByUser> create (@RequestBody WatchedByUser watched) {
        service.create(watched);
        return ResponseEntity.ok(watched);
    }

	@GetMapping("/{id}")
	public ResponseEntity<WatchedByUser> searchById (@PathVariable Integer id) {
		return ResponseEntity.ok(service.findById(id));
	}
    
	@PutMapping("/{id}")
	public ResponseEntity<WatchedByUser> atualizar(@PathVariable Integer id, @RequestBody WatchedByUser watched) {
		service.update(id, watched);
		return ResponseEntity.ok(watched);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.ok().build(); 
	}
}
