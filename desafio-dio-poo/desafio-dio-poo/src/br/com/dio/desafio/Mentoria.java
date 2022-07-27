package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}





