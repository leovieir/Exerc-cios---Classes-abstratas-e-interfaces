class Main {
  public static void main(String[] args) {
    Assalariado f1 = new Assalariado(1200f, null);

    Comissionado f2 = new Comissionado(0.01f, 10000);

    Comissionado f = new Comissionado(0.005f, 10000);

    Assalariado f3 = new Assalariado(1000f, f);

    PorHora f4 = new PorHora(10.0f, 40);

    System.out.println(f1.getPagamento());
    System.out.println(f2.getPagamento());
    System.out.println(f3.getPagamento());
    System.out.println(f4.getPagamento());
  }
}