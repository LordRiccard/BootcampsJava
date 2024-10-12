package impl.controller;

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

import impl.models.ImoveisAlugados;
import impl.services.ImoveisAlugadosService;

@RestController
@RequestMapping("/rented")
public class ImoveisAlugadosRestController {
    @Autowired
    private ImoveisAlugadosService alugadoService;

    @GetMapping
    public ResponseEntity<Iterable<ImoveisAlugados>> buscarTodos() {
        return ResponseEntity.ok(alugadoService.buscarTodos());
    }

    @GetMapping("/{id}")
	public ResponseEntity<ImoveisAlugados> buscarPorId(@PathVariable Integer id) {
		return ResponseEntity.ok(alugadoService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<ImoveisAlugados> inserir(@RequestBody ImoveisAlugados alugado) {
		alugadoService.inserir(alugado);
		return ResponseEntity.ok(alugado);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ImoveisAlugados> atualizar(@PathVariable Integer id, @RequestBody ImoveisAlugados alugado) {
		alugadoService.atualizar(alugado, id);
		return ResponseEntity.ok(alugado);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		alugadoService.deletar(id);
		return ResponseEntity.ok().build();
	}

}
