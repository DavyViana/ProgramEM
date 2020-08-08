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
    private String nome;
    private String email;
    private String dataDeNascimento;
    private String estado;
    private String cidade;
    private Integer numero;

    /**         Informações pessoais              */
    /**         Identidade de gênero              */

    String identidadeDeGenero;

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
    
    /*SET INFO GERAL*/

    public void setId(Integer id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDatadenascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    /*SET INFO PESSOAL*/
    /*IDENTIDADE DE GENERO*/

    public void setIdentidadeDeGenero(String identidadeDeGenero){
        this.identidadeDeGenero = identidadeDeGenero;
    }

    /*ORIENTAÇÃO SEXUAL*/

    public void setOrientacaoSexual(String orientacaoSexual){
        this.orientacaoSexual = orientacaoSexual;
    }

    /*IDENTIDADE ETNICO*/
    
    public void setIdentidadeEtnico(String identidadeEtnico){
        this.identidadeEtnico = identidadeEtnico;
    }

    /*ESCOLARIDADE*/

    public void setModalidade(String modalidade){
        this.modalidade = modalidade;
    }

    public void setAno(String ano){
        this.ano = ano;
    }

    /*PROGRAMAÇÃO*/

    public void setInteresseProgramacao(String interesseProgramacao){
        this.interesseProgramacao = interesseProgramacao;
    }

    public void setEstudoPrevio(String estudoPrevio){
        this.estudoPrevio = estudoPrevio;
    }

    public void setDisponibilidade(String disponibilidade){
        this.disponibilidade = disponibilidade;
    }

    public void setInteressecurso(String interesseCurso){
        this.interesseCurso = interesseCurso;
    }
    /*INICIO GET*/
    /*INFORMAÇÃO GERAL*/
    public Integer getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
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
        return this.identidadeDeGenero;
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