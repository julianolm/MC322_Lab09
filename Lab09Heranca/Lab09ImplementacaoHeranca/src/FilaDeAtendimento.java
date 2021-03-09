
public class FilaDeAtendimento extends Fila {
	private Lista listaPrioritaria;

	public FilaDeAtendimento() {
		super();
		listaPrioritaria = new Lista();
	}

	public void adicionarPrioritario(Pessoa pessoa) {
		listaPrioritaria.adicionarFim(pessoa);
	}

	@Override
	public void remover() {
		if (listaPrioritaria.tamanho() > 0)
			listaPrioritaria.removerInicio();
		else
			super.remover();
	}
	
	@Override
	public int tamanho() {
		return listaPrioritaria.tamanho() + super.tamanho();
	}
	
	@Override
	public void imprimir() {
		Impressora.imprime("Fila Normal: ");
		super.imprimir();
		Impressora.imprime("Fila prioritaria: ");
		listaPrioritaria.imprimir();
		Impressora.imprime("\n");
	}

}
