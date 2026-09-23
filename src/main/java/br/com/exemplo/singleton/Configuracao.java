package br.com.exemplo.singleton;

public class Configuracao {

    private static Configuracao instance = new Configuracao();

    private Configuracao() {
    }

    public static Configuracao getInstance() {
        return instance;
    }

    public String getNomeAplicacao() {
        return "Exemplo Singleton";
    }
}