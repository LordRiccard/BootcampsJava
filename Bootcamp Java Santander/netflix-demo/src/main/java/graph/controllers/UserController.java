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

import graph.domain.models.User;
import graph.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> create (@RequestBody User user) {
        service.create(user);
        return ResponseEntity.ok(user);
    }

	@GetMapping("/{id}")
	public ResponseEntity<User> searchById (@PathVariable Integer id) {
		return ResponseEntity.ok(service.findById(id));
	}
    
	@PutMapping("/{id}")
	public ResponseEntity<User> atualizar(@PathVariable Integer id, @RequestBody User user) {
		service.update(id, user);
		return ResponseEntity.ok(user);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.ok().build(); 
	}
}
