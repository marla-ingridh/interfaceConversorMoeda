public class Main {
    public static void main(String[] args) {

        ConversorMoeda valor = new ConversorMoeda();
        double valorEmReais = valor.converterDolarParaReal(500);
        System.out.println("Valor em Reais: " + valorEmReais);

    }
}