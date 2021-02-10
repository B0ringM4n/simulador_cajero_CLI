
public class Cuenta {
	
	public int nCuenta;
	public String cliente;
	private float saldo;
	
	public Cuenta() 
	{	
	}
	
	public void setCliente()
	{
		this.cliente="nuevo cliente";
	}
	
	public String getCliente()
	{
		return this.cliente;
	}
	
	public void ingresar(float deposito) 
	{	
		this.saldo=this.saldo+deposito;
	}
	
	public void extraer(float retiro) 
	{	
		if(!(this.saldo<retiro))
		{
			this.saldo=this.saldo-retiro;
		} else {System.out.println("Saldo insuficiente");}
	}
	
	public float getSaldo() 
	{
		return this.saldo;
	}
	public void setSaldo(float sald)
	{
		this.saldo=sald;
	}
}