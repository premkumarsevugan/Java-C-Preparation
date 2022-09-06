import java.util.*;
// import printlib.*;

class test {
	public static void main(String args[]) {
		// printObject p = new printObject();
		// p.println("Hello, James Titus");
		
		ArrayList<Integer>  arr  = new ArrayList<Integer>();

		for(int i = 0; i < 10; i++){
			arr.add(i);
		}


		for (int i : arr) {
			// p.println(i);
			System.out.println(i);
		}

        arr.add(3,200);

		System.out.println(arr);

	}
}