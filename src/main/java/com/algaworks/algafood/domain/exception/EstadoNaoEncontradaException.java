package com.algaworks.algafood.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EstadoNaoEncontradaException extends EntidadeNaoEncontradaException {
    private static final long serialVersionUID = 1L;

    public EstadoNaoEncontradaException(String mensagem){
        super(mensagem);
    }

    public EstadoNaoEncontradaException(Long estadoId) {
        this(String.format("Não existe um cadastro de estado com código %d", estadoId));
    }
}
