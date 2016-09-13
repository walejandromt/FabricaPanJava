public class Almacen {
	private int cantidad;
	private Ingrediente ing1;
	private Ingrediente ing2;
	private Ingrediente ing3;


	public Almacen(){}

	public Almacen(Ingrediente ing1, Ingrediente ing2, Ingrediente ing3){
		this.ing1 = ing1;
		this.ing2 = ing2;
		this.ing3 = ing3;
	}

	public void actualizar(){}

		public boolean vacio()
				throws MiExc{
		//devuelve false, si los ingredientes no dan, para crear dicho pan.
		//y resta ingredientes de tipo de pan


		boolean bol = true;


		if(ing1.getCantidad() <= 0 || ing2.getCantidad() <= 0 || ing3.getCantidad() <= 0){
			bol = false;
			System.out.println("El almacen esta vacio");
			throw new MiExc("FATAL ERROR. POR FAVOR COMPRA MAS INGREDIENTES PARA EL ALMACEN.");
		}else{
			//System.out.println("Cantidad en el almacen: " + ing1.getCantidad() + " " + ing2.getCantidad() + " " + ing3.getCantidad());
			bol = true;
		}


		return bol;
	}

	public void restaIngrediente(Pan p){
		//devuelve false, si los ingredientes no dan, para crear dicho pan.
		//y resta ingredientes de tipo de pan
		//System.out.println("Antes Cantidad en el almacen: " + ing1.getCantidad() + " " + ing2.getCantidad() + " " + ing3.getCantidad());
		ing1.resta(p.getHarina().getCantidad());
		ing2.resta(p.getHuevo().getCantidad());
		ing3.resta(p.getLeche().getCantidad());
		//System.out.println("Cantidad en el almacen: " + ing1.getCantidad() + " " + ing2.getCantidad() + " " + ing3.getCantidad());
	}

	public boolean isVacio()
				throws MiExc{
			
		//devuelve false, si los ingredientes no dan, para crear dicho pan.
		//y resta ingredientes de tipo de pan
		boolean bol = true;


		if(ing1.getCantidad() <= 0){
			bol = false;
			System.out.println("El almacen se quedo sin " + ing1.getNombre());
			System.out.println("Los Panes faltates no se fabricaran. ");
			System.out.println("Cantidad en el almacen: \n" + "Harina: "+ing1.getCantidad() + "\n " + 
															"Huevo: "+ing2.getCantidad() + "\n " + 
															"Leche: "+ing3.getCantidad());
			throw new MiExc("FATAL ERROR. POR FAVOR COMPRA MAS INGREDIENTES PARA EL ALMACEN.");
		}else if(ing2.getCantidad() <= 0 ){
			bol = false;
			System.out.println("El almacen se quedo sin " + ing2.getNombre());
			System.out.println("Los Panes faltates no se fabricaran. ");
			System.out.println("Cantidad en el almacen: \n" + "Harina: "+ing1.getCantidad() + "\n " + 
															"Huevo: "+ing2.getCantidad() + "\n " + 
															"Leche: "+ing3.getCantidad());
			throw new MiExc("FATALITY ERROR. !COMPRA MAS INGREDIENTES PARA EL ALMACEN.!");
		}else if(ing3.getCantidad() <= 0 ){
			bol = false;
			System.out.println("El almacen se quedo sin " + ing3.getNombre());
			System.out.println("Los Panes faltates no se fabricaran. ");
			System.out.println("Cantidad en el almacen: \n" + "Harina: "+ing1.getCantidad() + "\n " + 
															"Huevo: "+ing2.getCantidad() + "\n " + 
															"Leche: "+ing3.getCantidad());
			throw new MiExc("FATALITY ERROR. POR FAVOR COMPRA MAS INGREDIENTES PARA EL ALMACEN.");
		}


		return bol;
	}



	public Ingrediente getIng1(){
		return ing1;
	}

	public Ingrediente getIng2(){
		return ing2;
	}

	public Ingrediente getIng3(){
		return ing3;
	}

}



//getHa, getLe, getHv