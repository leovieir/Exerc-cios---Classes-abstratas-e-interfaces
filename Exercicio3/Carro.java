public class Carro implements CarbonFootprint{
  public static enum Combustivel{
    GASOLINA("Gasolina", 5),
    ETANOL("Etanol", 3),
    DIESEL("Diesel", 3),
    GNV("Gnv", 2),
    ELETRICO("Eletrico", 1);

    private String nome;
    private int poluicao;

    Combustivel(String nome, int poluicao){
      this.nome = nome;
      this.poluicao = poluicao;
    }

    public int getPoluicao(){
      return this.poluicao;
    }
  }

  private Combustivel combustivel;
  private float eficiencia;

  public Carro(Combustivel combustivel, float eficiencia){
    this.combustivel = combustivel;
    this.eficiencia = eficiencia;
  }

  public float getCarbonFootprint(){
    return this.combustivel.getPoluicao() / this.eficiencia;
  }
}