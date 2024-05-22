package dia2205;

import java.util.ArrayList;
import java.util.Arrays;

public class Exemplo02 {

	public static void main(String[] args) {
		String[] diciplinas = {"matematica", "filosofia", "historia", "fisica"};
		ArrayList<String> novalista = new ArrayList<String>(Arrays.asList(diciplinas));

		novalista.add("geografia");
		novalista.add("lingua inglesa");

		for(String i: novalista) {
		System.out.print("diciplina:" + i);
		}
	}

}
