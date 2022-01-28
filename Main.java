
public class Main {

	public static void main (String[]args) {
		
		Cliente bruna = new Cliente();
		bruna.setnome("bruna");
		
		Conta cc= new ContaCorrente(bruna);
		Conta poupanca= new ContaPoupanca(bruna);
		
		cc.depositar(300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}

