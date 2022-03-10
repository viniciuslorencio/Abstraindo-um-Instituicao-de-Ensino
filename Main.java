package poo;

import poo.Faculdade;
import poo.Curso;
import poo.Dev;
import poo.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Graduação Engenharia da Computação");
        curso1.setDescricao("Formar engenheiro da computação");
        curso1.setCargaHoraria(3600);

        Curso curso2 = new Curso();
        curso2.setTitulo("Graduação Analise e Desenv. de Sistemas");
        curso2.setDescricao("Formar Desenvolvedores");
        curso2.setCargaHoraria(2800);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria auxiliadora");
        mentoria.setDescricao("Auxiliar alunos no desenvolvimento");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Faculdade faculdade = new Faculdade();
        faculdade.setNome("Graduação Engenharia da Computação");
        faculdade.setDescricao("Formar engenheiro da computação");
        faculdade.getConteudos().add(curso1);
        faculdade.getConteudos().add(curso2);
        faculdade.getConteudos().add(mentoria);

        Dev devValter = new Dev();
        devValter.setNome("Valter Mikael");
        devValter.inscreverFaculdade(faculdade);
        System.out.println("Conteúdos Inscritos Valter:" + devValter.getConteudosInscritos());
        devValter.progredir();
        devValter.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Valter:" + devValter.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Valter:" + devValter.getConteudosConcluidos());
        System.out.println("XP:" + devValter.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverFaculdade(faculdade);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}