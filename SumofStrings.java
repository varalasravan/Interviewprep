#sum of two numerical strings in java. should return 1818 if 99 and 99 are added. return 1032 if 900 and 132 are added. 
class SumofStrings {
  public static void main(String[] args) {
    String a="",b="99";
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
