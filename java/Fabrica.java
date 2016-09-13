public class Fabrica{
	private Almacen alm;
	private CharEncodingDemo demo;
	//private Pan p;
	//private ArrayList<Pan> bandeja;

	public Fabrica(){}

	public void crearPan(Pan p, int cantidad)
			throws MiExc{
		//bandeja = new ArrayList();
			int x = 0;
		if(alm.vacio()){

			while(alm.isVacio() && cantidad != 0){
				//bandeja.add(new Pan(p.getNombre(), p.getTipo()));
				alm.restaIngrediente(p);
				
				cantidad--;
				
				if(alm.vacio()){
					x++;
					System.out.println("Pan " + x + " creado con exito");
				}
				
			}
			//determinar la cantidad, restar la cantidad en almacen
		}
	}

	public void cargar(){
		//posiblemente, instanciar almacen, y solicitar cargar archivo de ingredientes.

		 demo = new CharEncodingDemo();
		 demo.create();
		 
		 Ingrediente ing1 = new Ingrediente("Harina", demo.getHa());
		 Ingrediente ing2 = new Ingrediente("Huevo", demo.getHv());
		 Ingrediente ing3 = new Ingrediente("Leche", demo.getLe());


		alm = new Almacen(ing1, ing2, ing3);
		
			
	}

	public void actualizar(){
		demo.actualizar(alm.getIng1().getCantidad(), alm.getIng2().getCantidad(), alm.getIng3().getCantidad());
	}
}
