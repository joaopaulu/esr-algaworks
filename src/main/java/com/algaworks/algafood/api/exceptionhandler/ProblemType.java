package com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

    MENSAGEM_INCOMPREENSIVEL("/entidade-incompreensivel","Mensagem incompreensível"),
    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrada","Recurso não encontrado"),
    ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
    PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido"),
    ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio");

    private final String title;
    private final String uri;

    ProblemType(String path, String title){
        this.uri = "https://algafood.com.br" + path;
        this.title = title;
    }
}
