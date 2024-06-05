import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao do curso JavaScript");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java");
        bootcamp.setDescricao("Descricao do bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Camila => " + camila.getConteudosInscritos());
        camila.progredir();
        camila.progredir();
        System.out.println(camila.calcularTotalXp());
        System.out.println(camila.getConteudosInscritos());
        System.out.println(camila.getConteudosConcluidos());
        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println(joao.getConteudosInscritos());
        joao.progredir();
        joao.progredir();
        joao.progredir();

        System.out.println(joao.getConteudosConcluidos());
        System.out.println(joao.calcularTotalXp());






    }
}