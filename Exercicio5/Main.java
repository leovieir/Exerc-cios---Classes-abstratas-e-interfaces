import java.util.ArrayList;
import java.util.Scanner;

class Main{
  private static ArrayList<Recebivel> registros = new ArrayList<Recebivel>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    menu();
  }

  public static void menu(){
    
    System.out.println("0 - SAIR");
    System.out.println("1 - REGISTRAR VENDA");
    System.out.println("2 - REGISTRAR SERVIÇO");
    System.out.println("3 - LISTAR REGISTROS");

    int opcao = Integer.parseInt(scanner.next());

    if(opcao == 0){
      System.exit(0);
    }

    if(opcao == 1){
      System.out.println("Insira o nome do produto:");
      String nome = scanner.next();

      System.out.println("Insira a quantidade:");
      int quantidade = Integer.parseInt(scanner.next());

      System.out.println("Insira o valor unitário:");
      double valorUnitario = Double.parseDouble(scanner.next());

      ItemVenda venda = new ItemVenda(nome, quantidade, valorUnitario);

      registrarVenda(venda);
    }

    if(opcao == 2){
      System.out.println("Insira o serviço:");
      String descricao = scanner.next();

      System.out.println("Insira a quantidade de horas:");
      int horas = Integer.parseInt(scanner.next());

      System.out.println("Insira o preço por hora:");
      double precoHora = Double.parseDouble(scanner.next());

      Servico servico = new Servico(descricao, horas, precoHora);

      registrarServico(servico);
    }

    if(opcao == 3){
      imprimirRegistros();
    }

    menu();
  }

  public static void registrarVenda(ItemVenda venda){
    registros.add(venda);
  }

  public static void registrarServico(Servico servico){
    registros.add(servico);
  }

  public static void imprimirRegistros(){
    for(Recebivel registro : registros){
      registro.print();
    }
  }
}