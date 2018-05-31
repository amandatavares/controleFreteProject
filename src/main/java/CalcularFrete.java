public class CalcularFrete {

	private Calculo calculoFrete;
	private String cepOrigem;
	private String cepDestino;
	private NotaFiscal notaFiscal;
	
	/**
	 * @author Amanda e Junior
	 * @return valor calculado do frete
	 */
    public CalcularFrete(String cepOrigem, String cepDestino, NotaFiscal notaFiscal) {
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
        this.notaFiscal = notaFiscal;
    }

	public double valorFrete() {
		return calculoFrete.calcular(cepOrigem, cepDestino, notaFiscal);
	}
	
	/**
	 * @param calculoFrete the calculoFrete to set
	 */
	public void setFrete(Calculo calculoFrete) {
		this.calculoFrete = calculoFrete;
	}
}
