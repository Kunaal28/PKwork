package collectionsandgenericsassignment;

public class SwapPositions {

	public static <T> T[] swap(T[] list, int firstPos, int secondPos) {  

		if(firstPos < 0 || firstPos >= list.length ||
				secondPos < 0 || secondPos >= list.length) {
			throw new IndexOutOfBoundsException("Your indexes are out of bounds ");
		}

		T temp = list[firstPos];
	        list[firstPos] = list[secondPos];
	        list[secondPos] = temp;

	        return list;
	    } 


public static void main(String[] args) {
	System.out.println("------------Integer swapping------------");
	Integer[] iList = {11,7,15,5,8,19,43};
	
	System.out.println("Before swapping: ");
	for(Integer i : iList) {
		System.out.print(i + " ");
	}
	System.out.println();
	
	SwapPositions.swap(iList, 2, 4);
	
	System.out.println("After swapping: ");
	for(Number i : iList) {
		System.out.print(i + " ");
	}
	System.out.println();
	
	System.out.println("----------- String swapping ------------");
	
	String[] sList = {"nice", "good", "happy", "modest", "loyal", "awkward"};
	
	System.out.println("Before swapping: ");
	for(String s : sList) {
		System.out.print(s + " ");
	}
	System.out.println();
	
	SwapPositions.swap(sList, 2, 4);
	
	System.out.println("After swapping: ");
	for(String s : sList) {
		System.out.print(s + " ");
	}
	System.out.println();
}
       
       
}

