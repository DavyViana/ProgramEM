package com.programem.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/inscricao")
public class InscricaoController {

    @Autowired
    private InscricaoRepository InscricaoRepository;
    
    private ListaInscricao listaInscricao = new ListaInscricao();

    @GetMapping("/")
    public String InscricaoForm(){
      return "InscricaoForm";
    }

    @PostMapping(path="/insere") // Map ONLY POST Requests
    public @ResponseBody String addNewInscricao (
         @RequestParam String nome
        ,@RequestParam String estado
        ) {

            Inscricao i = new Inscricao();

            i.setNome(nome);
            i.setEstado(estado);

            InscricaoRepository.save(i);

            return nome+" "+estado;
    }

    @GetMapping(path="/lista")
    public @ResponseBody String getAllCliente() {
        
        Iterable<Inscricao> resultado = InscricaoRepository.findAll();
     
        return listaInscricao.listaInscricao(resultado);
    }
    @GetMapping(path="/filtro")
    public @ResponseBody String getInscricao(@RequestParam Integer idade) {
        
        Iterable<Inscricao> resultado = InscricaoRepository.findInscricao(idade);
     
        return listaInscricao.listaInscricao(resultado);
  
    } 

    @GetMapping(path="/filtroForm")
    public String filtroForm() {
      return "filtroForm";
  
    }
}