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

import impl.models.Imovel;
import impl.services.ImovelService;

@RestController
@RequestMapping("/property")
public class ImovelRestController {
    @Autowired
    private ImovelService imovelService;

    @GetMapping
    public ResponseEntity<Iterable<Imovel>> buscarTodos() {
        return ResponseEntity.ok(imovelService.buscarTodos());
    }

    @GetMapping("/{id}")
	public ResponseEntity<Imovel> buscarPorId(@PathVariable Integer id) {
		return ResponseEntity.ok(imovelService.buscarPorId(id));
	}

	@PostMapping
	public ResponseEntity<Imovel> inserir(@RequestBody Imovel imovel) {
		imovelService.inserir(imovel);
		return ResponseEntity.ok(imovel);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Imovel> atualizar(@PathVariable Integer id, @RequestBody Imovel imovel) {
		imovelService.atualizar(imovel, id);
		return ResponseEntity.ok(imovel);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		imovelService.deletar(id);
		return ResponseEntity.ok().build();
	}
}
