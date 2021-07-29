public class ItemVenda implements Recebivel{
  private String produto;
  private int quantidade;
  private double precoUnitario;

  public ItemVenda(String produto, int quantidade, double precoUnitario){
    this.produto = produto;
    this.quantidade = quantidade;
    this.precoUnitario = precoUnitario;
  }

  public String getProduto(){
    return this.produto;
  }

  public double totalizarReceita(){
    return this.quantidade * this.precoUnitario;
  }

  public void print(){
    System.out.println(this.produto + ":\t" + this.quantidade + " uni.\t" + "R$ " + this.precoUnitario + "\tTotal: R$ " + this.totalizarReceita());
  }
}