import java.util.*;

public class FirstNonRepeating {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Deque<Integer> q = new ArrayDeque<>();


        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add((int) ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }

        System.out.println();
    }
    public static void main(String args[]) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}