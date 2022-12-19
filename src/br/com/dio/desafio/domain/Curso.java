package br.com.dio.desafio.domain;

public class Curso extends Conteudos {
   private int cargaHoraria;

   public Curso(String titulo, String descricao, int cargaHoraria) {
      super(titulo, descricao);
      this.cargaHoraria = cargaHoraria;
   }

   public int getCargaHoraria() {
      return cargaHoraria;
   }

   public void setCargaHoraria(int cargaHoraria) {
      this.cargaHoraria = cargaHoraria;
   }

   @Override
   public double CalcXP() {
      return BASE_XP * cargaHoraria;
   }

   @Override
   public String toString() {
      return "Curso{" +
              "title='" + getTitulo() + '\'' +
              ", description='" + getDescricao() + '\'' +
              ", hoursAmount=" + cargaHoraria +
              '}';
   }
}
