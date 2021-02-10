import java.util.Scanner;
public class Cajero {

	public int numCajero;
	public int bandera;
	private Cuenta cta;
	public opcion opc1,opc2,opc3,opc4,opc5,opc6;
	
	public void cls()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println("");
		}
	}
	
	public Cajero()
	{
		this.numCajero=18347;
	}
	
	public void crearCuentaVacia()
	{
		cls();
		if(!(bandera==1))
		{
			cta=new Cuenta();
			cta.setSaldo(0);
			System.out.println("Cuenta creada correctamente");
			this.bandera=1;
		}else {System.out.println("Una cuenta ya esta creada");}
	}
	
	public void crearCuentaconSaldo()
	{
		cls();
		if(!(bandera==1))
		{
			float s;
			cta=new Cuenta();
			System.out.println("Ingrese el saldo de inicio");
			Scanner leer=new Scanner(System.in);
			s=leer.nextFloat();
			cta.setSaldo(s);
			leer.reset();
			
			System.out.println("Cuenta creada correctamente");
			this.bandera=1;
		} else {System.out.println("Una cuenta ya esta creada");}
	}
	
	public void depositar()
	{
		cls();
		if(bandera==1)
		{
			float dep;
			System.out.println("Ingrese el saldo a depositar");
			Scanner leer=new Scanner(System.in);
			try
			{
				dep=leer.nextFloat();
				cta.ingresar(dep);
			} catch(Exception e) {System.out.println("Ingrese digitos correctos");}
			
			leer.reset();
			
		} else {System.out.println("Necesita crear una cuenta para acceder a esta opcion");} 
	}
	
	public void retirar()
	{
		cls();
		if(bandera==1)
		{	
			float ret;
			System.out.println("Ingrese el saldo a retirar");
			Scanner leer=new Scanner(System.in);
			try
			{
				ret=leer.nextFloat();
				cta.extraer(ret);
			}catch(Exception e ){System.out.println("Ingrese digitos correctos");}
			
			leer.reset();
			
		} else {System.out.println("Necesita crear una cuenta para acceder a esta opcion");}
	}
	
	public void imprSaldo()
	{
		cls();
		if(bandera==1)
		{
			System.out.println(cta.getSaldo());
		}else {System.out.println("Necesita crear una cuenta para acceder a esta opcion");}
	}
	
	public void mostrarMenu()
	{
		opc1=new opcion("|  1.-Crear cuenta vacia       |");
		opc2=new opcion("|  2.-Crear cuenta con saldo   |");
		opc3=new opcion("|  3.-Ingresar dinero          |");
		opc4=new opcion("|  4.-Retirar dinero           |");
		opc5=new opcion("|  5.-Mostrar saldo            |");
		opc6=new opcion("|  6.-Salir                    |");
		
		System.out.println("|------------------------------|");
		System.out.println(opc1.verOpciones());
		System.out.println(opc2.verOpciones());
		System.out.println(opc3.verOpciones());
		System.out.println(opc4.verOpciones());
		System.out.println(opc5.verOpciones());
		System.out.println(opc6.verOpciones());
		System.out.println("|------------------------------|");
	}
	
	
}
