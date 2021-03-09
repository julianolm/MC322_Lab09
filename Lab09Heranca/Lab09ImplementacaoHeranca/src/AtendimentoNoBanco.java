
public class AtendimentoNoBanco {
	public static void main(String[] args) {
		FilaDeAtendimento clientes = new FilaDeAtendimento();

		Pessoa cliente1 = new Pessoa("Joao", 32, "124536025-13");
		Pessoa cliente2 = new Pessoa("Carlos", 33, "864536025-25");
		Pessoa cliente3 = new Pessoa("Maria", 61, "124536025-22");
		Pessoa cliente4 = new Pessoa("Pedro", 22, "126536073-03");
		Pessoa cliente5 = new Pessoa("Bianca", 80, "123534057-05");

		clientes.adicionar(cliente1);
		clientes.adicionar(cliente2);
		clientes.adicionarPrioritario(cliente3);
		clientes.adicionar(cliente4);
		clientes.adicionarPrioritario(cliente5);

		clientes.imprimir();

		clientes.remover();
		clientes.remover();

		clientes.imprimir();

		clientes.remover();

		clientes.imprimir();
		
		clientes.remover();

		clientes.imprimir();
		
		clientes.remover();
		
		clientes.imprimir();
		
		clientes.remover();

		clientes.imprimir();
	}
}
