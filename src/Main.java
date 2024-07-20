import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devBrena = new Dev();
        devBrena.setNome("Brena Soares");
        devBrena.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Brena Soares" + devBrena.getConteudoInscritos());
        devBrena.progredir();
        devBrena.progredir();
        System.out.println("Conteúdos inscritos Brena Soares" + devBrena.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Brena Soares" + devBrena.getConteudoConcluidos());
        System.out.println("XP: " + devBrena.calcularTotalXp());

        System.out.println("=================");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi Fernandez");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Davi Fernandez" + devDavi.getConteudoInscritos());
        devDavi.progredir();
        System.out.println("Conteúdos inscritos Davi Fernandez" + devDavi.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Davi Fernandez" + devBrena.getConteudoConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp());

    }
}