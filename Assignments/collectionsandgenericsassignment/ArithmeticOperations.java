package collectionsandgenericsassignment;

import java.util.List; 
import java.util.Vector; 
/**
 * Supports arithmetic operations of +, -, *, / on any type that are subclasses 
 * of {@link java.lang.Number}.
 * @author pchandra
 *
 */
public class ArithmeticOperations 
{ 
/**
 * Generic method to add 2 numbers.
 * @param t1
 * @param t2
 * @return
 */
public static <T extends Number> Number add(T t1, T t2) 
 { return (t1.doubleValue() + t2.doubleValue()); } 

public static <T extends Number> Number sub(T t1, T t2) 
{ 
	return (t1.doubleValue() - t2.doubleValue());
	} 
public static <T extends Number> Number divide(T t1, T t2) 
{ 
	return (t1.doubleValue() / t2.doubleValue());
} 
/**
 * Demostrates Upper Bounded Wildcards.
 * Generic method to add numbers from a list.
 * @param t1
 * @param t2
 * @return
 */
public static <T extends Number> Number add(List<? extends Number> list) 
 { 
 double d = 0;; 
 for (int i = 0; i < list.size(); i++) 
 d += list.get(i).doubleValue(); 
 
 return new Double(d); 
 }
 public static <T extends Number> Number sub(List<? extends Number> list) 
 { 
	 double d = 0;; 
	 for (int i = 0; i < list.size(); i++) 
		 d -= list.get(i).doubleValue(); 
	 
	 return new Double(d); 
 } 
 public static <T extends Number> Number divide(List<? extends Number> list) 
 { 
	 double d = 0;; 
	 for (int i = 0; i < list.size(); i++) 
		 d /= list.get(i).doubleValue(); 
	 
	 return new Double(d); 
 } 
 
/**
 * Demostrates Unbounded Wildcards.
 * Generic method to dump list data to console.
 * @param t1
 * @param t2
 * @return
 */
public static void dumpList(List<?> list) 
 { 
 System.out.println("List dump with unbounded wildcard:"); 
 for (int i = 0; i < list.size(); i++) 
 System.out.println(list.get(i)); 
 } 

public static void main(String[] args) 
 { 
 // Adding 2 integers
 Integer i1 = new Integer(34), i2 = new Integer(43); 
 System.out.println("Add with generic method: " + 
ArithmeticOperations.add(i1, i2)); 
 Float f1 = new Float(12.56), f2 = new Float(3.6778); 
 System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2)); 
 // Adding 2 integers through a list
 Vector<Number> l = new Vector<Number>(); 
 l.add(new Integer(34)); 
 l.add(new Integer(43)); 
 System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l)); 
 
 System.out.println("Sub with generic method: " + 
		 ArithmeticOperations.sub(i1, i2)); 
 System.out.println("Sub with generic method: " + ArithmeticOperations.sub(f1, f2)); 
 // Dividing 2 integers through a list
 
 System.out.println("Sub with upper bounded wildcard: " + ArithmeticOperations.sub(l)); 
 
 System.out.println("Divide with generic method: " + 
		 ArithmeticOperations.divide(i1, i2)); 
 System.out.println("Divide with generic method: " + ArithmeticOperations.divide(f1, f2)); 
 // Dividing 2 integers through a list
 
 System.out.println("Divide with upper bounded wildcard: " + ArithmeticOperations.divide(l)); 
 
 // Dumping the list to the console.
 ArithmeticOperations.dumpList(l); 
 } 
} 