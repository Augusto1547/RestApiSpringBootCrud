package br.com.banco.fuctura;

// metodos importantes do JpaRepository: https://www.youtube.com/watch?v=jh_T5_o3qKE&ab_channel=DevSuperior
//https://www.youtube.com/watch?v=UjQO3HSd6Ys&ab_channel=DanieleLe%C3%A3o
//http:https://www.youtube.com/watch?v=d_5iZJ8p9x8&list=PLbA-jMwv0cuUp3UKlLHng6E-xgD037bXz&index=2&ab_channel=ProgramadoraBordo
//playlist: https://www.youtube.com/watch?v=5NGi1X9EIc4&list=PLJeHuFa-g2c8Q5ORE0LxZSeDdKVCixXDI&ab_channel=WillianOizumi
//https://www.youtube.com/watch?v=9GWK9A79tEc&ab_channel=AlgaWorks 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
//@AllArgsContructor ou @Autowired ou pelo o construtor de ContaController
public class ContaController {

	@Autowired
	ContaRepository contaRepository;

	@PostMapping
	public Conta saveConta(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public List<Conta> getAllCarros() {
		return contaRepository.findAll();
	}

	@GetMapping("/{id}")
	public Conta getContaById(@PathVariable Long id) {
		return contaRepository.findById(id).get();
		// entre outras
	}

	@DeleteMapping("/{id}")
	public void deleteConta(@PathVariable Long id) {

		contaRepository.deleteById(id);
	}

	@GetMapping("/")
	public String HelloWorld() {

		return "Hello world ai eu to ligado na parada mas sem crocodilagem "
				+ "safado é safado de humilde a malandragem nem mané galinha" + "e nem zé pequeno";
	}
}
