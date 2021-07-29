public class Assalariado implements Funcionario{
  private float salario;

  private Comissionado comissao;

  public Assalariado(float salario, Comissionado comissao){
    this.salario = salario;
    this.comissao = comissao;    
  }

  public float getPagamento(){
    if(this.comissao != null){
      this.salario *= 1.1;
    }

    float salario = this.salario;

    if(this.comissao != null){
      salario += comissao.getPagamento();
    }

    return salario;
  }

}