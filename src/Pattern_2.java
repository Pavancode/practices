public class Pattern_2 {
    public static void main(String[] args) {
        int i =0;
        int row =5;
        while(i<row){
            int column = 0;
            while (column<=i){
                System.out.print("& ");
                column++;
            }
            System.out.println();
            i++;
        }
    }

}
