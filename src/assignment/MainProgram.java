package assignment;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Hydrogen Helium Lithium Beryllium Boron Carbon Nitrogen Oxygen
 * @author 
 *
 */
public class MainProgram {
	public static void main(String args[]) {
		/**
		 * task 2
		 */
//		SinglyLinkedList mySLL = new SinglyLinkedList();
//		Scanner scan = new Scanner(System.in);
//		String nextString;
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			// System.out.println(mySLL.toString());
//			mySLL.insert(nextString);
//			mySLL.toString();
//			System.out.println("！！！！！！！！！！！！！！！！！！");
//		}
		
//############################################################################3		
		/**
		 * task 3
		 */
//		SinglyLinkedList mySLL = new SinglyLinkedList();
//		Scanner scan = new Scanner(System.in);
//		String nextString;
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.insert(nextString);
//			mySLL.toString();
//		}
//
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.remove(nextString);
//			mySLL.toString();
//		}
//		
//		
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.insert(nextString);
//			mySLL.toString();
//			System.out.println("！！！！！！！！！！！！！！！！！！");
//		}
//##################################################################
		
		/**
		 * Task 5
		 */
		
//		SinglyLinkedList mySLL = new SinglyLinkedList();
//		Scanner scan = new Scanner(System.in);
//		String nextString;
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.insert(nextString);
//		}
//		
//		
//		long startTime;
//		long endTime;
//		long all = 0;
//		int i = 0;
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			startTime = System.nanoTime();
//			mySLL.removeTask5(nextString);
//			endTime = System.nanoTime();
//			all = all+endTime - startTime;
////			System.out.println(i+":"+all);
//			i++;
//			System.out.println("the average time of " + i +" times : "+all/i);
////			System.out.println("！！！！！！！！！！！！！！！！！！");
//		}
		
//#########################################################################
		/**
		 * Task 7
		 */
//		SinglyLinkedList mySLL = new SinglyLinkedList();
//		Scanner scan = new Scanner(System.in);
//		String nextString;
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.insertTask7(nextString);
//			mySLL.toString();
//			System.out.println("！！！！！！！！！！！！！！！！！！");
//		}
//
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.removeTask7(nextString);
//			mySLL.toString();
//			System.out.println("！！！！！！！！！！！！！！！！！！");
//		}
//		
//		
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			mySLL.insertTask7(nextString);
//			mySLL.toString();
//			System.out.println("！！！！！！！！！！！！！！！！！！");
//		}
		SinglyLinkedList mySLL = new SinglyLinkedList();
		Scanner scan = new Scanner(System.in);
		String nextString;
		while (scan.hasNext()) {
			nextString = scan.next();
			// We must use equals().Otherwise we won't succeed.
			if (nextString.equals("s")) {
				break;
			}
			/**
			 * either code below is OK
			 */
			mySLL.insertTask7(nextString);
		}
		
		
		long startTime;
		long endTime;
		long all = 0;
		int i = 0;
		scan = new Scanner(System.in);
		while (scan.hasNext()) {
			nextString = scan.next();
			// We must use equals().Otherwise we won't succeed.
			if (nextString.equals("s")) {
				break;
			}
			startTime = System.nanoTime();
			mySLL.removeTask7(nextString);
			endTime = System.nanoTime();
			all = all+endTime - startTime;
//			System.out.println(i+":"+all);
			i++;
			System.out.println("the average time of " + i +" times : "+all/i);
//			System.out.println("！！！！！！！！！！！！！！！！！！");
		}
		
		
		
		
		
		
		
		
		
		
		
//		SinglyLinkedList mySLL = new SinglyLinkedList();
//		Scanner scan = new Scanner(System.in);
//		String nextString;
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			// System.out.println(mySLL.toString());
//			mySLL.insert(nextString);
//		}
//		################
//		mySLL.insert("Hydrogen");
//		mySLL.insert("Helium");
//		mySLL.insert("Lithium");
//		mySLL.insert("Beryllium");
//		mySLL.insert("Boron");
//		mySLL.insert("Carbon");
//		mySLL.insert("Nitrogen");
//		mySLL.insert("Oxygen");
//		mySLL.insert("Fluorine");
//		mySLL.insert("Neon");
		
		
		
		
//	###################################	
//		long startTime;
//		long endTime;
//		long all = 0;
//		int i = 0;
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			// System.out.println(mySLL.toString());
//			startTime = System.nanoTime();
//			mySLL.removeTask5(nextString);
//			endTime = System.nanoTime();
//			mySLL.toString();
//			all = endTime - startTime;
//			System.out.println(i+":"+all);
//			i++;
//			################
			
//			all = all + endTime - startTime;
//			i++;
//			System.out.println(/*i+":"+all*/ all/i);
			
			
//			mySLL.removeTask5(nextString);
//			mySLL.removeTask7(nextString);
//		}
		
//		mySLL.removeTask5("Hydrogen");
//		mySLL.removeTask5("Helium");
//		mySLL.removeTask5("Lithium");
//		mySLL.removeTask5("Beryllium");
//		mySLL.removeTask5("Boron");
//		mySLL.removeTask5("Carbon");
//		mySLL.removeTask5("Nitrogen");
//		mySLL.removeTask5("Oxygen");
//		mySLL.removeTask5("Fluorine");
//		mySLL.removeTask5("Neon");
		
		
		
		
//		SinglyLinkedList mySLL = new SinglyLinkedList();
//		Scanner scan = new Scanner(System.in);
//		String nextString;
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			// System.out.println(mySLL.toString());
//			mySLL.insertTask7(nextString);
//			mySLL.toString();
//		}
//
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			// System.out.println(mySLL.toString());
////			mySLL.remove(nextString);
//			mySLL.removeTask5(nextString);
////			mySLL.removeTask7(nextString);
//			mySLL.toString();
//		}
//		
//		
//		scan = new Scanner(System.in);
//		while (scan.hasNext()) {
//			nextString = scan.next();
//			// We must use equals().Otherwise we won't succeed.
//			if (nextString.equals("s")) {
//				break;
//			}
//			/**
//			 * either code below is OK
//			 */
//			// System.out.println(mySLL.toString());
//			mySLL.insertTask7(nextString);
//			mySLL.toString();
//		}
	}
}

/**
 * the program below is my test program there is no need for teach to read it
 * just for me to remember how to use Scanner
 */
/*
 * public static void main(String args[]){ Scanner scan = new
 * Scanner(System.in); String a; ArrayList <String> c = new ArrayList<String>();
 * while (scan.hasNext()) { a = scan.next(); c.add(a);
 * System.out.println(a+"\n"); } }
 */
