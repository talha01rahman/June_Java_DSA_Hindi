public class calci {
    public static Scanner scn = new Scanner(System.in);


    public static int calculation( )  {
        int a = scn.nextInt();
        int b = scn.nextInt();
       scn.nextLine();
       String op = scn.nextLine();

        if (op=="+")
            return a + b;
        else if (op=="-")
            return a - b;
        else if (op=="*")
            return a * b;
        else if (op=="/")
            return a / b;
        else
            return 0;
        }   // end of calculator()

    public static void main(String[] args) {
       
        int ans = calculation();
        System.out.println(ans);

}

}
