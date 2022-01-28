
public class Conta implements IConta{
	
    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;
      
    protected  int agencia;
	protected  int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia= Conta.AGENCIA_PADRAO;
		this.numero=Conta.SEQUENCIAL++;
		this.cliente=cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo-=valor;	
		}
		
	@Override	
	public void depositar(double valor) {
		saldo+=valor;	
		}
		
	@Override	
	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor);
		contadestino.depositar(valor);
		}
	
	public int getagencia() {
		return agencia;
	}
	
	public int getnumero() {
		return numero;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void imprimirExtrato() {}
		

	
	protected void imprimirInfoComuns() {
		System.out.println("Titular: "+this.cliente.getnome());
		System.out.println("Agência: "+this.agencia);
		System.out.println("Número: "+this.numero);
		System.out.println("Saldo:"+this.saldo);
	}
}
