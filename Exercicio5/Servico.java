public class Servico implements Recebivel{
  private String descricao;
  private int horas;
  private double precoHora;

  public Servico(String descricao, int horas, double precoHora){
    this.descricao = descricao;
    this.horas = horas;
    this.precoHora = precoHora;
  }

  public double totalizarReceita(){
    return this.horas * this.precoHora;
  }

  public void print(){
    System.out.println(this.descricao + ":\tR$ " + this.precoHora + "\t" + this.horas + " horas\tTotal: R$ " + this.totalizarReceita());
  }
}