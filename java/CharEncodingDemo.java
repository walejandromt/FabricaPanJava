import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharEncodingDemo {
		private int ha;
		private int hv;
		private int le;

	public void actualizar(int ha, int hv, int le){
		this.ha = ha;
		this.hv = hv;
		this.le = le;
try {
        
    
	  //Character enconding.(1)

        FileOutputStream outputFile = new FileOutputStream("DataBase.txt");
	OutputStreamWriter writer = new OutputStreamWriter(outputFile, "8859_1");
	BufferedWriter bufferedWriter1 = new BufferedWriter(writer);
	PrintWriter printWriter = new PrintWriter(bufferedWriter1, true);
	//System.out.println("Writing using encoding: " + writer.getEncoding());
	

	//Print Java primitive values, one on each line.
		// System.out.println(ha,hv,le);
	printWriter.println("HARINA:");
	printWriter.println(ha);
	printWriter.println("HUEVO:");
	printWriter.println(hv);
	printWriter.println("LECHE:");
	printWriter.println(le);
	
	 


	//Create a BufferedReader which uses 8859_1 character enconding
	FileInputStream inputFile = new FileInputStream("DataBase.txt");
	InputStreamReader reader = new InputStreamReader(inputFile, "8859_1");
	BufferedReader bufferedReader = new BufferedReader(reader);
	


	//Read the (exact number of) Java primitive values.
	//in the same order they were written out, one on each line

	
	
	String    c = bufferedReader.readLine();
	



	//Check for end of stream:
	String line = bufferedReader.readLine();

	

	//Close the reader, which also closes the underlying stream
	  bufferedReader.close();

	//Write the values read on the terminal.

	
	
	//System.out.println(c);
} catch (IOException e) {
        
    }



	}




	public void create() {
	  //Character enconding.(1)

 
try{

	//Create a BufferedReader which uses 8859_1 character enconding
	FileInputStream inputFile = new FileInputStream("DataBase.txt");
	InputStreamReader reader = new InputStreamReader(inputFile, "8859_1");
	BufferedReader bufferedReader = new BufferedReader(reader);


	//Read the (exact number of) Java primitive values.
	//in the same order they were written out, one on each line

	//boolean v = bufferedReader.readLine().equals("true")? true : false;
	String   a = bufferedReader.readLine();
		          ha = Integer.parseInt(bufferedReader.readLine());
	String   b = bufferedReader.readLine();
		          hv = Integer.parseInt(bufferedReader.readLine());
	String   c = bufferedReader.readLine();
		          le = Integer.parseInt(bufferedReader.readLine());



	//Check for end of stream:
	String line = bufferedReader.readLine();


	//Close the reader, which also closes the underlying stream
	  bufferedReader.close();

	//Write the values read on the terminal.

	  
	//System.out.println("ha");
	//System.out.println(ha);
	//System.out.println("hv");
	//System.out.println(hv);
	//System.out.println("le");
	//System.out.println(le);

	}catch (IOException e) {
        //, NumberFormatException nFe
    }

		}

		public int getHa(){
			return ha;
		}

		public int getHv(){
			return hv;
		}

		public int getLe(){
			return le;
		}
}