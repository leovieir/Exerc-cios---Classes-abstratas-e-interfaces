public class Bicicleta implements CarbonFootprint{
  private String modelo;

  public Bicicleta(String modelo){
    this.modelo = modelo;
  }

  public float getCarbonFootprint(){
    return 0.0f;
  }

}