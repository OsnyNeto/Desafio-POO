import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JScript");
        curso2.setDescricao("descrição curso JScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria1);
//        System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devOsny = new Dev();
        devOsny.setNome("Osny");
        devOsny.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos"+ devOsny.getConteudosInscritos());
        devOsny.progredir();
        devOsny.progredir();
        devOsny.progredir();
        System.out.println("Conteúdos inscritos"+ devOsny.getConteudosInscritos());
        System.out.println("Conteúdos concluídos"+ devOsny.getConteudosConcluidos());
        System.out.println("XP: "+ devOsny.calcularTotalXp());


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos"+ devCamila.getConteudosConcluidos());

        System.out.println("XP: "+ devCamila.calcularTotalXp());
    }
}
