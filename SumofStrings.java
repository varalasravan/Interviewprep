class SumofStrings {
  public static void main(String[] args) {
    String a="",b="99";

    System.out.println(distinctPairs(s));
    System.out.println(sumOfStrings(a,b));
  }
    public static String sumOfStrings(String a, String b){
        String res="";
        int sum=0, n =a.length(),m=b.length();
        int diff = 0;
        if(n<m){
            diff = m-n;
            for(int i=0;i<diff;i++){
                a="0"+a;
            }
        for(int i=0;i<m;i++){
            String x=Character.toString(a.charAt(i));
            String y=Character.toString(b.charAt(i));
            sum = Integer.parseInt(x)+Integer.parseInt(y);

            res = res+Integer.toString(sum);
        }
        }
        else{
            diff = n-m;
            for(int i=0;i<diff;i++){
                b="0"+b;
            }
            for(int i=0;i<n;i++){
            String x=Character.toString(a.charAt(i));
            String y=Character.toString(b.charAt(i));
            sum = Integer.parseInt(x)+Integer.parseInt(y);

            res = res+Integer.toString(sum);
        }
        }

        
        return res;
    }
}
