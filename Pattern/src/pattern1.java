public class pattern1 {

    public static void main(String[] args) {
pattern1(5);
    }
    static void pattern1(int n){
        for (int row=1;row<=n;row++){
           //for every row run the col
            for (int col=1;col<=row;col++)
                System.out.println("* ");
        }
        //when one row is printed ,we need to add aa newline
        System.out.println();
    }
}
