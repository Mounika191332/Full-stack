class ReverseDiagonal {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,3},
                      {4,3,7,8},
                      {2,3,5,9},
                      {1,8,9,0}
        };
        int r=arr.length;
        int c=arr[0].length;
        int i=0;
        int j=c-1;
     
        while(i<r&&j>=0){
            System.out.println(arr[i][j]);
            i++;
            j--;
        }
        
        
    }
}