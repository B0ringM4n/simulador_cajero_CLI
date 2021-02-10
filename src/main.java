import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		Cajero cajero=new Cajero();
		
		
		
		while(opc!=6)
		{
			Scanner leer=new Scanner(System.in);
			cajero.mostrarMenu();
			try
			{
				opc=leer.nextInt();
			
			
			switch(opc)
			{
			
			case 1:
				cajero.crearCuentaVacia();
				break;
				
			case 2:
				cajero.crearCuentaconSaldo();
				break;
				
			case 3:
				cajero.depositar();
				break;
				
			case 4:
				cajero.retirar();
				break;
				
			case 5:
				cajero.imprSaldo();
				break;
				
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("Opcion incorrecta");
			}
			}catch(Exception e) {System.out.println("Ingrese digitos correctos");}
			opc=0;
			leer.reset();
			
		}
		
	}

}
