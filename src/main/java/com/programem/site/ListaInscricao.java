package com.programem.site;

public class ListaInscricao {
    
    String listaInscricao(Iterable<Inscricao> lista){
        String html = "";

        for(Inscricao i : lista){
            html = html +
            "<h1>"+i.getNome()+"</h1>"+
            i.getEstado()+"<br>"+
            "<br>"
            ;
        }
        return html;
    }
}