//Classe ConversorMoeda implementando a interface ConversaoFinanceira
public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.91;
        return valorDolar * cotacaoDolar;
    }
}
