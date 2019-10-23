import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList<Munze> wechselgeld = Munze.getWechselgeld(526);

		for (Munze m : wechselgeld) {
			System.out.println(m);
		}

		/*
		 * boolean next = false;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * LinkedList<String> list = new LinkedList<>();
		 * 
		 * System.out.println("Enter your value ");
		 * 
		 * list.add(input.next());
		 * 
		 * System.out.println("Noch ?j/n"); String ja = input.next();
		 * 
		 * 
		 * 
		 * 
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * System.out.println("mm " + list.get(i));
		 * 
		 * }
		 * 
		 * // for (ListIterator<String> it = list.listIterator(); it.hasNext();)
		 * { // // System.out.println(it.next()); // // }
		 */
	}

}
