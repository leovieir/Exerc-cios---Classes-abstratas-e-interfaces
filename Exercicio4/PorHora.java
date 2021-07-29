public class PorHora implements Funcionario{
  private float precoPorHora;
  private int horasDeTrabalho;

  public PorHora(float precoPorHora, int horasDeTrabalho){
    this.precoPorHora = precoPorHora;
    this.horasDeTrabalho = horasDeTrabalho;
  }

  public float getPagamento(){
    float pagamento = 0.0f;

    if(this.horasDeTrabalho <= 40){
      pagamento = this.precoPorHora * this.horasDeTrabalho;
    }

    else{
      pagamento = this.precoPorHora * 1.5f * (this.horasDeTrabalho - 40) + this.precoPorHora * 40;
    }

    return pagamento;
  }
}