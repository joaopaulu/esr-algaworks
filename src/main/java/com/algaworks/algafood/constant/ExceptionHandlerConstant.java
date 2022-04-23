package com.algaworks.algafood.constant;

public class ExceptionHandlerConstant {
    public static final String CORPO_REQUISICAO_INVALIDO =
            "O corpo da requisição está inválido. Verifique o erro de sintaxe.";
    public static final String PROPRIEDADE_INCOMPATIVEL =
            "A propriedade '%s' recebeu o valor '%s', que é de um tipo inválido. Corrija e informe um valor "
            + "compátivel com o tipo %s.";
    public static final String PROPRIEDADE_NAO_ENCONTRADA =
            "A propriedade '%s' não existe. Corrija ou remova essa propriedade e tente novamente.";
    public static final String PARAMENTRO_URL_INVALIDO =
            "O parâmentro de URL '%s' recebeu o valor '%s', que é de um tipo inválido. Corrija e "
            + "informe um valor compatível com o tipo %s";
    public static final String RECURSO_INEXISTENTE = "O recurso %s, que você tentou acessaar, é inexistente.";
    public static final String CAMPOS_INVALIDOS = "Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente.";
    public static final String ERRO_INTERNO = "O correu um erro interno inesperado no sistema"
            + "Tente novamente e se o problema persistir, entre em contato com o administrador do sistema.";
}
