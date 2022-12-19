import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class App {
   public static void main(String[] args) {
      Curso curso1 = new Curso("Curso de Java", "Descrição curso java", 8);
      Curso curso2 = new Curso("Curso de JS", "Descrição curso js", 4);

      Mentoria mentoria1 = new Mentoria("Mentoria Java", "descrição mentoria java", LocalDate.now());

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descricao bootcamp java developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria1);

      Dev devJoao = new Dev();
      devJoao.setNome("Joao");
      devJoao.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());

      devJoao.progredir();
      System.out.println("---------------------------------------------------------------------");
      System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
      System.out.println("Conteudos finalizados Joao: " + devJoao.getConteudosFinalizados());
      System.out.println("XP total Joao: " + devJoao.calcTotalXp());
   }
}
