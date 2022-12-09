package com.algaworks.algafood;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.service.CadastroCozinhaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class CadastroCozinhaIntegrationTests {

  @Autowired
  private CadastroCozinhaService cadastroCozinha;

  @Test
  public void deveAtribuirID_QuandoCadastrarCozinhaComDadosCorretos() {
    Cozinha novaCozinha = new Cozinha();
    novaCozinha.setNome("Chinesa");

    novaCozinha = cadastroCozinha.salvar(novaCozinha);

    assertThat(novaCozinha).isNotNull();
    assertThat(novaCozinha.getId()).isNotNull();
  }

  @Test
  public void deveFalhar_QuandoCadastrarCozinhaSemNome() {
    Cozinha novaCozinha = new Cozinha();
    novaCozinha.setNome(null);

    ConstraintViolationException erroEsperado =
            Assertions.assertThrows(ConstraintViolationException.class, () -> {
              cadastroCozinha.salvar(novaCozinha);
            });

    assertThat(erroEsperado).isNotNull();
  }

}
