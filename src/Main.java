import java.util.LinkedList;

public class Main {
	
	/* +---------------------------------------------
	 * | @author Isac Canedo
	 * +---------------------------------------------
	 */

	/*
	 * What will this program print out to the console when executed? (O que este
	 * programa imprimirá no console quando executado?)
	 * 
	 * 1 - [10, 1, 5]
	 * 2 - [1, 5, 10]
	 * 3 - [10, 5, 1]
	 * 4 - [5, 1, 10] ==> correct
	 * 
	 */

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(1);
		list.add(10);

		System.out.println(list);

	}

}
