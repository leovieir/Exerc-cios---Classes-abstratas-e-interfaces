public class Comissionado implements Funcionario{
  private float taxaComissao;
  private float valorVendas;

  public Comissionado(float taxaComissao, float valorVendas){
    this.taxaComissao = taxaComissao;
    this.valorVendas = valorVendas;
  }

  public float getPagamento(){
    return this.taxaComissao * this.valorVendas;
  }
}