import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanNumeralToDecimal(roman));
        }
    }
}

class Solution {
    public int romanNumeralToDecimal(String s) {
      Map<Character, Integer> map = new HashMap<>();
      map.put('I', 1);  
      map.put('V', 5); 
      map.put('X', 10);
      map.put('L', 50); 
      map.put('C', 100); 
      map.put('D', 500); 
      map.put('M', 1000);   

      int result = map.get(s.charAt(s.length()-1));

      for(int i = s.length()-2; i>= 0;i--){
          if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
              result -= map.get(s.charAt(i)); 
          }
          else{
              result += map.get(s.charAt(i)); 
          }
      }
      return result;
    }
}