public class Control{
	public static void main(String[] args){
		Menu m = new Menu();
		try{
		//run
			m.run();
		} catch(MiExc e){
			e.printStackTrace();
		}finally{

		}

		m.actualizar();
	}
}