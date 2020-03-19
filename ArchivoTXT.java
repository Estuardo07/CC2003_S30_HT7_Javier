//Javier Hernández 19202

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArchivoTXT {
	
	/**
	 * Funcion para leer el txt
	 * @return
	 */
	public static ArrayList<String> leerTxt(String path) {
		
		File archivo = new File(path);
		FileReader fReader;
		BufferedReader bReader;
		ArrayList<String> lineas = new ArrayList<String>();
		
		try {
			
			fReader = new FileReader(archivo);
			bReader = new BufferedReader(fReader);
			
			
			String linea = "";
			
			while((linea = bReader.readLine()) != null) {
				lineas.add(linea);
				
			}
			
			
			bReader.close();
			fReader.close();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ha sucedido un error leyendo el archivo " + e);
		}
		
		return lineas;
	}

}
