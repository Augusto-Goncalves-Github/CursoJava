package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploLeituraArquivo {
	
	public static void main(String[] args) throws IOException {		
		gravarArquivo(); // metodo
		lerArquivo();    // metodo
		
		gravarArquivoComWriter(); // metodo 
		lerArquivoComReader();    // metodo
	}

	private static void gravarArquivoComWriter() throws IOException {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				"/home/java01/exemplo_writer.txt"))){	
			
			bufferedWriter.write("Gravando em arquivo usando writer");
		}		
	}

	private static void lerArquivoComReader() throws IOException, IOException {
		try(BufferedReader reader = new BufferedReader(new FileReader(
				"/home/java01/exemplo_writer.txt"))){
			
			String line = reader.readLine();
			while(line != null){				
				System.out.println(line);
				line = reader.readLine();
			}
		}		
	}

	private static void lerArquivo() throws IOException {
		try( FileInputStream fileInputStream = new FileInputStream("/home/java01/exemplo.txt")){
			byte buffer[] = new byte[5];		
			int read = fileInputStream.read(buffer);
			
			while(read != -1){
				System.out.println(new String(buffer, 0, read));
				read = fileInputStream.read(buffer);
			}
		}		
	}

	private static void gravarArquivo() throws IOException,
			FileNotFoundException {
		String counteudoDoArquivo = "Meu primeiro arquivo em java";
		
		try (FileOutputStream out = new FileOutputStream("/home/java01/exemplo.txt")){
			out.write(counteudoDoArquivo.getBytes());
		}
	}

}
