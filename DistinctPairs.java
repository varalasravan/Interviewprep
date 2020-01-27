# No.of distinct triplets in a given string.

class DistinctPairs {
  public static void main(String[] args) {
    String s="abcdaaaea";
    System.out.println(distinctPairs(s));
   }
public static int distinctPairs(String s){
    int count=0;
    for(int i=0;i<s.length()-2;i++){
        char first_char = s.charAt(i);
        char second_char = s.charAt(i+1);
        char third_char = s.charAt(i+2);
        if(first_char!=second_char)
            if(second_char!=third_char)
                if(third_char!=first_char)
                    count++;
        }
        return count;
    }
}
