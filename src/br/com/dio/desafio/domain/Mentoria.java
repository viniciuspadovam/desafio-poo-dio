package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudos {
   private LocalDate data;

   public Mentoria(String titulo, String descricao, LocalDate data) {
      super(titulo, descricao);
      this.data = data;
   }

   public LocalDate getData() {
      return data;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }

   public double calcXP() {
      return BASE_XP + 20d;
   }

   @Override
   public double CalcXP() {
      return 0;
   }

   @Override
   public String toString() {
      return "Mentoria{" +
              "title='" + getTitulo() + '\'' +
              ", description='" + getDescricao() + '\'' +
              ", date=" + data +
              '}';
   }
}
