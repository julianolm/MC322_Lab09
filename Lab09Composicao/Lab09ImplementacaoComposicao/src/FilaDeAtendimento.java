
public class FilaDeAtendimento {
	private Fila filaNormal;
	private int tamanhoFilaNormal;
	private Fila filaPrioritaria;
	private int tamanhoFilaPrioritaria;

	public FilaDeAtendimento() {
		filaNormal = new Fila();
		filaPrioritaria = new Fila();
		this.tamanhoFilaNormal = 0;
		this.tamanhoFilaPrioritaria = 0;
	}

	public void adicionar(Pessoa pessoa) {
		filaNormal.adicionar(pessoa);
		this.tamanhoFilaNormal++;
	}

	public void adicionarPrioritario(Pessoa pessoa) {
		filaPrioritaria.adicionar(pessoa);
		this.tamanhoFilaPrioritaria++;
	}

	public void remover() {
		if (tamanhoFilaPrioritaria > 0) {
			filaPrioritaria.remover();
			tamanhoFilaPrioritaria--;
		} else {
			filaNormal.remover();
			tamanhoFilaNormal--;
		}
	}

	public int tamanho() {
		return tamanhoFilaNormal + tamanhoFilaPrioritaria;
	}

	public void imprimir() {
		Impressora.imprime("Fila Normal: ");
		filaNormal.imprimir();
		Impressora.imprime("Fila prioritaria: ");
		filaPrioritaria.imprimir();
		Impressora.imprime("\n");
	}
}
