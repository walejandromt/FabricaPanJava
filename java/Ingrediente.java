public class Ingrediente{
	private String nombre = "";
	private int cantidad = 0;

	public Ingrediente(){}

	public Ingrediente(String nombre, int cantidad){
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public void resta(int r){
		
		cantidad = (cantidad - r);
		
		if(cantidad<0)
			cantidad = 0;
	}

	public int getCantidad(){
		return cantidad;
	}

	public String getNombre(){
		return nombre;
	}

	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

}