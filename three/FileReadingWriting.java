package com.java.assignmenteight.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingWriting {
	
	public static File f ;
	public static FileReader fr;
	public static FileWriter fw ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createFile();
		
		try {
			fr = new FileReader("F:/SourceCoding/acadglig/src/com/java/assignmenteight/three/FileReadingWriting.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			fw = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		copyOperation();
		
		
		try {
			fr.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void copyOperation() {
		// TODO Auto-generated method stub
		int character ;
		try {
			while (( character = fr.read()) != (-1)) {
				fw.write(character);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	private static void createFile() {
		// TODO Auto-generated method stub
		f = new File("F:/SourceCoding/acadglig/src/com/java/assignmenteight/three/TextFile.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
