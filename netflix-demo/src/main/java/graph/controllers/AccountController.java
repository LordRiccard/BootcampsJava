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

import graph.domain.models.Account;
import graph.services.AccountService;

@RestController
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping
    public ResponseEntity<Account> create (@RequestBody Account account) {
        service.create(account);
        return ResponseEntity.ok(account);
    }

	@GetMapping("/{id}")
	public ResponseEntity<Account> searchById (@PathVariable Integer id) {
		return ResponseEntity.ok(service.findById(id));
	}
    
	@PutMapping("/{id}")
	public ResponseEntity<Account> atualizar(@PathVariable Integer id, @RequestBody Account account) {
		service.update(id, account);
		return ResponseEntity.ok(account);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.ok().build(); 
	}
}
