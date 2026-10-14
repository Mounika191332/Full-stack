class DiaEq1 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,3},
                      {4,3,7,8},
                      {2,3,5,9},
                      {1,8,9,0}
        };
        int r=arr.length;
        int c=arr[0].length;
        int i=0;
        int j=0;
        boolean isValid=true;
     
        while(i<r&&j<c){
            if(arr[i][j]!=1){
                isValid=false;
            //System.out.println("flase");
            }
            i++;
            j++;
        }
        System.out.println(isValid);
        
    }
}