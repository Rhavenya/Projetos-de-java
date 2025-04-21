public class Calculadora {
    public static void main(String[] args) {
        double precoOriginal = 1205.50;
        System.out.println("O valor do produto é: " + precoOriginal);
        double valorDesconto = 20;
        double percentualDesconto = valorDesconto/100;
        System.out.println("O valor do desconto será: " + valorDesconto + "%");
        double calculoValorDesconto = (precoOriginal) * percentualDesconto;
        System.out.println("O valor do produto será de: " + calculoValorDesconto);

    }
}
