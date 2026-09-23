package br.com.exemplo.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    public void deveRetornarSempreAMesmaInstancia() {
        Configuracao instancia1 = Configuracao.getInstance();
        Configuracao instancia2 = Configuracao.getInstance();
        assertSame(instancia1, instancia2);
    }
}