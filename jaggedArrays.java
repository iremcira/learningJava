public class jaggedArrays {
    public static void main(String[] args) {
        
        int nums1[][] = new int[3][]; //jagged

        nums1[0] = new int[3];
        nums1[1] = new int[4];
        nums1[2] = new int[2];

        for(int i=0; i < nums1.length; i++){
            for(int j=0; j < nums1[i].length; j++){
                nums1[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int n[]: nums1){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


    }
}
