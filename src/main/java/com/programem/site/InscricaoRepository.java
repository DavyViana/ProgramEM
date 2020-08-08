package com.programem.site;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Deletepackage com.programem.site;

public interface InscricaoRepository extends CrudRepository<Inscricao, Integer> {

}