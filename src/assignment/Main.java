package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.temporal.JulianFields;
import java.util.Iterator;

public class Main {
	static SinglyLinkedList sLL=new SinglyLinkedList(1000);
	/*
	It is a method to check whether the data is in the list. If so, remove and display.
	*/
/*	public static void judgeRemovable(String data){
		if(sLL.remove(data)){
			SLLIterator it=sLL.getIterator();
			System.out.println("\n"+"After I remove "+data+",the result is:");
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		else{
			System.out.println("\n"+"Sorry, the data does not exist!");
		}
	}*/
	/*
		To display an iterator
	*/
/*	public static void displayIterator(){
		SLLIterator it=sLL.getIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	
	
	//Calculate time of removing one data
	public static long time(int words,String data)
	{
		long oldTime=java.lang.System.nanoTime();
		judgeRemovable(data);
		long nowTime=java.lang.System.nanoTime();
		return nowTime-oldTime;
	}*/
	public static void main(String[] args) {
		
		// TODO 自动生成的方法存根
		String line;
		File file = new File("1000words.txt");
		try{
			FileReader fr = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fr);
			
			while((line = bufferedReader.readLine())!=null){
				sLL.insertTask7(line);
			}
			fr.close();

			System.out.println(sLL.toString());

		}catch(IOException e){
			e.printStackTrace();
		}
		//If I want to remove all elements in the file, use this:
		try{
			FileReader fr2 = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader2 = new BufferedReader(fr2);
			long start = System.nanoTime();
			while((line=bufferedReader2.readLine())!=null){
//				System.out.println(line);
				sLL.removeTask7(line);
//				judgeRemovable(line);
			}
			System.out.println("The array now is:"+"\n"+sLL.toString());
			long end = System.nanoTime();
			System.out.println("the result is:"+(end-start)/1000);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		//If I want to remove the particular element from a file and get the time, use this:
/*		time(10,"There");
		time(100,"darkponchos");
		time(1000,"enda");*/
		
/*		sLL.insert("Hydrogen");
		sLL.insert("Helium");
		sLL.insert("Lithium");
		sLL.insert("Beryllium");
		sLL.insert("Boron");
		sLL.insert("Carbon");
		sLL.insert("Nitrogen");
		sLL.insert("Oxygen");
		System.out.println(sLL);
		displayIterator();
		
		//Removing data

		judgeRemovable("Boron");
		System.out.println("\n"+sLL);*/

	/*	judgeRemovable("Helium");
		System.out.println("\n"+sLL);
		
		judgeRemovable("Plutonium");
		System.out.println("\n"+sLL);
		
		judgeRemovable("Lithium");
		System.out.println("\n"+sLL);
		
		judgeRemovable("Oxygen");
		System.out.println("\n"+sLL);
		
		judgeRemovable("Hydrogen");
		System.out.println("\n"+sLL);

		//Inserting data
		sLL.insert("Fluorine");
		System.out.println(sLL);
		displayIterator();
		
		sLL.insert("Neon");
		System.out.println("\n"+sLL);
		displayIterator();
		
		sLL.insert("Sodium");
		System.out.println("\n"+sLL);
		displayIterator();
		
		sLL.insert("Magnesium");
		System.out.println("\n"+sLL);
		displayIterator();
		
		sLL.insert("Aluminium");
		System.out.println("\n"+sLL);
		displayIterator();
		
		sLL.insert("Silicon");
		System.out.println("\n"+sLL);
		displayIterator();*/

		//task 1:My first choice
/*		sLL.insert("i");
		sLL.insert("am");
		sLL.insert("a");
		sLL.insert("good");
		sLL.insert("student");
		sLL.insert("in");
		sLL.insert("neu");
		System.out.println(sLL.toString());
		
		*/
		//My second choice
/*		sLL.insert("the");
		sLL.insert("way");
		sLL.insert("to");
		sLL.insert("learn");
		sLL.insert("data");
		sLL.insert("structure");
		sLL.insert("is");
		sLL.insert("practicing");
		sLL.insert("a");
		sLL.insert("lot");
		sLL.insert("by");
		sLL.insert("doing");
		sLL.insert("code");
		sLL.insert("work");
		System.out.println(sLL.toString());
		sLL.remove("to");
		long old=System.nanoTime();
		sLL.remove("way");
		System.out.println(System.nanoTime()-old);
		sLL.remove("by");
		sLL.remove("doing");
		sLL.remove("a");*/
		
		
	}

}
