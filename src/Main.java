public class Main {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        for(int i = 0; i < 11; ++i){
            array[0][i] = i;
        }
        for(int i = 0; i < 11; ++i){
            array[i][0] = i;
        }

        for(int i = 1; i < 11; ++i){
            for(int j = 1; j < 11; ++j){
                array[i][j] = i*j;
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
