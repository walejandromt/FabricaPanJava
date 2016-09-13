	import java.util.Scanner;
public class Menu{
	private Pan a;
	private Pan b;
	private Scanner sc;
	private int operacion;
	private int cantidad;
	private Fabrica fabr;

	public Menu(){sc = new Scanner(System.in);}

	public void run()
			throws MiExc{
//--------------------ENCIENDE MAQUINA-------------------------------------------------------------
				fabr = new Fabrica();
				System.out.println("Enciende Maquina");
				System.out.println("fabrica.cargar();");
				fabr.cargar();
//--------------------ENCIENDE MAQUINA------------------------------------------------------------

//--------------------CONSOLA-------------------------------------------------------------
			System.out.println("Que tipo de PAN desea frabricar: ");
			System.out.println("1.-Pan A");
			System.out.println("2.-Pan B");
			operacion = sc.nextInt();
//--------------------CONSOLA-------------------------------------------------------------

		switch(operacion){
//--------------------PAN A-------------------------------------------------------------
		  case 1:
		Ingrediente harinaA = new Ingrediente("Harina", 7);
		Ingrediente huevoA = new Ingrediente("Huevo", 5);
		Ingrediente lecheA = new Ingrediente("Leche", 6);
		a = new Pan("Concha", "Bolo", harinaA, huevoA, lecheA);

//-------------------SOLICITAR CANTIDAD A ---------------------------------------------------
		System.out.println("¿CUANTOS PANES NECESITARA?");
		cantidad = sc.nextInt();
		fabr.crearPan(a, cantidad);
//-------------------SOLICITAR CANTIDAD A ---------------------------------------------------
		  break;
//--------------------PAN A-------------------------------------------------------------

//--------------------PAN B-------------------------------------------------------------
		  case 2:
		Ingrediente harinaB = new Ingrediente("Harina", 6);
		Ingrediente huevoB = new Ingrediente("Huevo", 3);
		Ingrediente lecheB = new Ingrediente("Leche", 2);
		b = new Pan("Cuernos", "Dulce", harinaB, huevoB, lecheB);

//-------------------SOLICITAR CANTIDAD B ---------------------------------------------------
		System.out.println("¿CUANTOS PANES NECESITARA?");
		cantidad = sc.nextInt();
		fabr.crearPan(b, cantidad);
//-------------------SOLICITAR CANTIDAD B ---------------------------------------------------
		  break;
//--------------------PAN B-------------------------------------------------------------
		}
		//actualizar();

	}


	public void actualizar(){
		//--------------------ACTUALIZAR ALMACEN-------------------------------------------------------------
				System.out.println("Almacen actualizado();.");
				fabr.actualizar();
//--------------------ACTUALIZAR ALMACEN------------------------------------------------------------
	}


}