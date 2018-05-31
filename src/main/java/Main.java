public class Main {
    public static void main(String[] args) {
        NotaFiscal nf = new NotaFiscal();
        CalcularFrete calcularFrete = new CalcularFrete("60864-460","603838-234",nf);

        FreteFracionado freteFracionado = new FreteFracionado();
        FreteLotacao freteLotacao = new FreteLotacao();

        calcularFrete.setFrete(freteFracionado);
        System.out.println("Valor do frete fracionado: R$" + calcularFrete.valorFrete());

        calcularFrete.setFrete(freteLotacao);
        System.out.println("Valor do frete lotação: R$" + calcularFrete.valorFrete());
    }
}