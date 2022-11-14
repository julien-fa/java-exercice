package orsys.atelier.exercices.serialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialisation {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File("config.bin")));
		
		stream.writeObject(new Config("https//:jdbc:postgres", "localhost", "marc", "pwd125"));
		stream.flush();
		stream.close();		
		
		Serialisation.deserialise();
		
	}
	
	public static void deserialise() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File("config.bin")));
		 
		Config configOne = (Config) stream.readObject();
		
		System.out.println(configOne.toString());
	}
}
