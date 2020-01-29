class DiagonalSort {
    public static void main(String[] args) {
        int[][] a= new int[][]{{1,3,9,4}, {9,5,7,7},{3,6,9,7},{1,2,2,2}};
    diagonalSort(a);
    }

    public static void diagonalSort(int[][] a){
        int n=a.length,i=0;
        int m=a[0].length;
    
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(a[row][col]+" ");
                }
            System.out.println();
            }

        while(i<n){
            for(int row=0;row<n;row++){
                for(int col=0;col<m;col++){
                    if(row+1<n && col+1<m)
                        if(a[row][col]>a[row+1][col+1]){
                            int temp = a[row][col];
                            a[row][col]=a[row+1][col+1];
                            a[row+1][col+1] = temp;
                        }
                    
                }
            }
            i++;
        }
        System.out.println("Diagonally sorted Array:");
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(a[row][col]+" ");
                }
            System.out.println();
            }

    }
}
