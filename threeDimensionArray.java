public class threeDimensionArray {
    public static void main(String[] args) {
        int numz[][][] = new int[3][4][5];


        for(int i=0; i< numz.length; i++){
            for(int j=0; j < numz[i].length; j++){
                for(int k=0; k < numz[j].length; k++){
                    numz[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
    }
}
