package br.com.banco.fuctura;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "contas", path = "contas")
public interface ContaRepository extends JpaRepository<Usuario, Long> {

	
}
