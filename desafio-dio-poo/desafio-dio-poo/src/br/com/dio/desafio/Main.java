package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descricao curso java");
      curso1. setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso git");
        curso2.setDescricao("descricao curso git");
        curso2. setCargaHoraria(3);

        Curso curso3= new Curso();
        curso3.setTitulo("curso js");
        curso3.setDescricao("descricao curso js");
        curso3. setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("mentoria de java avançado");
        mentoria1. setProfessor("Camila");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
      System.out.println(mentoria1);*/

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.getDescricao("Descrica Bootcamp de Java");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(curso3);
      bootcamp.getConteudos().add(mentoria1);
      Dev devJuliana = new Dev();
      devJuliana.setNome("Juliana");
      devJuliana.inscreverBootcamp(bootcamp);
      devJuliana.pregredir();
      System.out.println("Conteudos Inscritos" + devJuliana.getconteudosinscritos()) ;



    }

}
