public class Pan{
	private String nombre;
	private String tipo;
	private Ingrediente harina;
	private Ingrediente huevo;
	private Ingrediente leche;

	public Pan(){}

	public Pan(String nombre, String tipo){
		this.nombre = nombre;
		this.tipo = tipo;
		//in1.setCantidad(in1);
		//in2.setCantidad(in2);
		//in3.setCantidad(in3);
	}

	public Pan(String nombre, String tipo, Ingrediente harina, Ingrediente huevo, Ingrediente leche){
		this.nombre = nombre;
		this.tipo = tipo;
		this.harina = harina;
		this.huevo = huevo;
		this.leche = leche;
	}

	public Ingrediente getHarina(){
		return harina;
	}

	public Ingrediente getHuevo(){
		return huevo;
	}

	public Ingrediente getLeche(){
		return leche;
	}

	public String getNombre(){
		return nombre;
	}

	public String getTipo(){
		return tipo;
	}

}