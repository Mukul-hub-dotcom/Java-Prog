public class operator {
    public static void main(String[] args) {
        //  comparison || realtional operator
        //  == ,  <= , >= , != , > , <

        // assignment operator
        // = , += , -= , *= , /=

        int b=5;
        b+=10;
        System.out.println(b);

        // Logical operator
        // && , || , !
        int c=10;
        System.out.println((b>10)&&(c<15));
        System.out.println((b>10)||(c>10));
        boolean d=true;
        System.out.println(!d);

        // ternary operator
        // variable=condition?statement1:satement2;

        String h=(15%2==0)?"even":"odd";
        System.out.println(h);
    }
}
