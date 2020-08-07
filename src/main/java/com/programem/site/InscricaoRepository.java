package com.programem.site;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Deletepackage com.programem.site;



public interface InscricaoRepository extends CrudRepository<Inscricao, Integer> {


    @Query(
        value = "SELECT * FROM inscricao i WHERE i.idade >= :idade",
        nativeQuery = true)
        Iterable<Inscricao> findInscricao(@Param("idade")Integer idade);

}