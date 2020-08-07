package com.programem.site;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /** indica que o Banco de Dados deve criar uma tabela para esse objeto */
public class Inscricao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    /**         Informações gerais               */
    
    private Integer id;

    String nome;

    String email;

    String dataDeNascimento;

    String estado;

    String cidade;

    Integer numero;

    /**         Informações pessoais              */
    /**         Identidade de gênero              */

    String identidaDeGenero;

    /**         Orientação sexual                 */

    String orientacaoSexual;

    /**         Identidade etnico-racial           */

    String identidadeEtnico;

    /**         Escolaridade                       */

    String modalidade;

    String ano;

     /**         Programação                       */

    String interesseProgramacao;

    String estudoPrevio;

    String disponibilidade;

    String interesseCurso;
    
    /**              SetInfoGeral                          */

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDatadenascimento(String Datadenascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEstado(String Estado){
        this.estado = estado;
    }

    public void setCidade(String Cidade){
        this.cidade = cidade;
    }

    public void setNumero(String Numero){
        this.numero = numero;
    }

    /**              SetInfoPessoal           */
    /**              SetIdenGenero               */

    public void setIdentidadedegenero(String Identidadedegenero){
        this.identidaDeGenero = identidaDeGenero;
    }

    /**              SetIdenSex                  */

    public void setOrientacaosexual(String Orientacaosexual){
        this.orientacaoSexual = orientacaoSexual;
    }

    /**              SetIdenEtnico                  */
    
    public void setIdentidadeetnico(String Identidadeetnico){
        this.identidadeEtnico = identidadeEtnico;
    }

    /**              SetEscolaridade                  */

    public void setModalidade(String Modalidade){
        this.modalidade = modalidade;
    }

    public void setAno(String Ano){
        this.ano = ano;
    }

    /**         Programação                       */

    public void setInteresseprogramacao(String Interesseprogramacao){
        this.interesseProgramacao = interesseProgramacao;
    }

    public void setEstudoprevio(String Estudoprevio){
        this.estudoPrevio = estudoPrevio;
    }

    public void setDisponibilidade(String Disponibilidade){
        this.disponibilidade = disponibilidade;
    }

    public void setInteressecurso(String Interessecurso){
        this.interesseCurso = interesseCurso;
    }

    /**                GetInfoGeral              */
    public Integer getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDatadenascimento(){
        return this.dataDeNascimento;
    }

    public String getEstado(){
        return this.estado;
    }

    public String getCidade(){
        return this.cidade;
    }
    
    public Integer getNumero(){
        return this.numero;
    }
    /**Informações Pessoais         */
    /**Identidade de genero         */
    
    public String getIdentidadedegenero(){
        return this.identidaDeGenero;
    }

    /**Identidade de sexual         */

    public String getOrientacaosexual(){
        return this.orientacaoSexual;
    }

    /**Identidade etnico-racial      */

    public String getIdentidadeetnico(){
        return this.identidadeEtnico;
    }

    /**            Escolaridade      */

    public String getModalidade(){
        return this.modalidade;
    }
    public String getAno(){
        return this.ano;
    }

     /**           Programação      */

     public String getInteresseprogramacao(){
        return this.interesseProgramacao;
    }

    public String getEstudoprevio(){
        return this.estudoPrevio;
    }

    public String getDisponibildade(){
        return this.disponibilidade;
    }

    public String getInteressecurso(){
        return this.interesseCurso;
    }


}