public abstract class Construcao implements CarbonFootprint{
  private int numPessoas;
  private boolean usaArCondicionado;
  private int qntLampadas;

  public Construcao(int numPessoas, boolean usaArCondicionado, int qntLampadas){
    this.numPessoas = numPessoas;
    this.usaArCondicionado = usaArCondicionado;
    this.qntLampadas = qntLampadas;
  }

  public float getCarbonFootprint(){
    float poluicao = this.numPessoas * this.qntLampadas;

    if(this.usaArCondicionado){
      poluicao *= 3;
    }

    return poluicao;
  }
}