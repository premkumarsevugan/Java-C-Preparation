import java.util.*;

public class ConsecCharRemov {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(st.empty()){
                break;
            }
            if (st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }
        if(st.empty()){
            System.out.println("Enter valid String.");
            
        }
        else{
            while (!st.empty()) {
                System.out.print(st.peek());
                st.pop();
            }
        }
        sc.close();
    }
}