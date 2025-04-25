import java.util.*;
import java.io.*;

class th {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("b.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
    
    String st;
    int vowel = 0, num = 0, nol = 0;

    while ((st = br.readLine()) != null) {
      for (int i = 0; i < st.length(); i++) {
        char ch = st.charAt(i);
        
        if ( (ch >= '0' && ch <= '9')) {
          num++;
        }

        if (isVowel(ch)) vowel++;
      }

      bw.write(st);
      bw.newLine();
      nol++;
    }

    br.close();
    bw.close();

    System.out.println("done");
    System.out.println("Vowels: " + vowel);
    System.out.println("Alphanumeric characters: " + num);
    System.out.println("Number of lines: " + nol);
  }

  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }
}
