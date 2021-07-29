import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Bicicleta bicicleta1 = new Bicicleta("Nike");
    Bicicleta bicicleta2 = new Bicicleta("Olympus");

    Carro carro1 = new Carro(Carro.Combustivel.GASOLINA, 5.0f);
    Carro carro2 = new Carro(Carro.Combustivel.ELETRICO, 12.0f);

    /*Construcao construcao1 = new Construcao(10, true, 10);
    Construcao construcao2 = new Construcao(8, false, 11);*/

    //Não podemos instanciar um objeto Construcao, por que ela é uma classe abstrata

    Escola escola1 = new Escola(1000, 8);
    Escola escola2 = new Escola(3000, 12);

    Casa casa1 = new Casa(4, true);
    Casa casa2 = new Casa(4, false);

    ArrayList<CarbonFootprint> carbonos = new ArrayList<CarbonFootprint>();

    carbonos.add(bicicleta1);
    carbonos.add(bicicleta2);

    carbonos.add(carro1);
    carbonos.add(carro2);

    /*carbonos.add(construcao1);
    carbonos.add(construcao2);*/

    carbonos.add(escola1);
    carbonos.add(escola2);

    carbonos.add(casa1);
    carbonos.add(casa2);

    for(CarbonFootprint carbono : carbonos){
      System.out.println(carbono.getCarbonFootprint());
    }
  }
}