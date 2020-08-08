package com.programem.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class InscricaoController {

    @Autowired
    private InscricaoRepository InscricaoRepository;
    
    private ListaInscricao listaInscricao = new ListaInscricao();

    @GetMapping("/")
    public String InscricaoForm(){
      return "inscricaoForm";
    }

    @PostMapping(path="/insere") // Requests de tudo
    public @ResponseBody String addNewInscricao (
         @RequestParam String nome
        ,@RequestParam String email
        ,@RequestParam String dataDeNascimento
        ,@RequestParam String estado
        ,@RequestParam String cidade
        ,@RequestParam String numero
        ,@RequestParam String identidadeDeGenero
        ,@RequestParam String orientacaoSexual
        ,@RequestParam String identidadeEtnico
        ,@RequestParam String modalidade
        ,@RequestParam String ano
        ,@RequestParam String interesseProgramacao
        ,@RequestParam String estudoPrevio
        ,@RequestParam String disponibilidade
        ,@RequestParam String interesseCurso

        ) {
            //* criação do objeto*/
            Inscricao i = new Inscricao();

            i.setNome(nome);
            i.setEmail(email);
            i.setDatadenascimento(dataDeNascimento);
            i.setEstado(estado);
            i.setCidade(cidade);
            i.setNumero(numero);
            i.setIdentidadedegenero(identidadeDeGenero);
            i.setOrientacaosexual(orientacaoSexual);
            i.setIdentidadeetnico(identidadeEtnico);
            i.setModalidade(modalidade);
            i.setAno(ano);
            i.setInteresseprogramacao(interesseProgramacao);
            i.setEstudoprevio(estudoPrevio);
            i.setDisponibilidade(disponibilidade);
            i.setInteressecurso(interesseCurso);

            InscricaoRepository.save(i);

            return nome+" "+email+" "+dataDeNascimento+" "+estado+" "+cidade+" "+numero+" "+identidadeDeGenero+" "+orientacaoSexual+" "+identidadeEtnico+" "+modalidade+" "+ano+" "+interesseProgramacao+" "+estudoPrevio+" "+disponibilidade+" "+interesseCurso;
    }

    @GetMapping(path="/lista")
    public @ResponseBody String getAllCliente() {
        
        Iterable<Inscricao> resultado = InscricaoRepository.findAll();
     
        return listaInscricao.listaInscricao(resultado);
    }
}