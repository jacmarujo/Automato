
public class Transicao {

	private int estadoInicial;
	private char simbolo;
	private int estadoFinal;
	
	public Transicao() {
		super();
	}

	public Transicao(int estadoInicial, char simbolo, int estadoFinal) {
		super();
		this.estadoInicial = estadoInicial;
		this.simbolo = simbolo;
		this.estadoFinal = estadoFinal;
	}

	public int getEstadoInicial() {
		return estadoInicial;
	}

	public void setEstadoInicial(int estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public int getEstadoFinal() {
		return estadoFinal;
	}

	public void setEstadoFinal(int estadoFinal) {
		this.estadoFinal = estadoFinal;
	}

	public void imprime() {
		System.out.println("Estado Inicial " + this.estadoInicial);
		System.out.println("Simbolo " + this.simbolo);
		System.out.println("Estado Final " + this.estadoFinal);
		System.out.println("**************************************");
	}
}
