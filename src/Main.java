public class Main {

    public static void main(String[] args) {
        /*1. Printati "Hello" in consola, iar pe rand nou,printati numele vostru */

        System.out.println( "Exercitiu 1 \n");
        System.out.println("Hello");
        System.out.println ("Alexandra\n");

            String prenume = "Alexandra";
            String nume = "Vasilache \n";

        System.out.println("Hello\n" + prenume + "\n" +
                nume );

        /* 2. Printati rezultatul impartirii a doua numere
        Atentie, daca numarul este intreg, sa afiseze valorile dupa virgula
         ex: 10/3= 3.3333
         */
        System.out.println( "Exercitiu 2");
            double a = 10;
            double b = 3;
            double imp = a/b;

        System.out.println( a + "/" + b + " = " + imp + "\n");

        /* 3. printati rezultatul urmatoarelor operatiuni: */
        System.out.println( "Exercitiu 3");

        /* a.-5+8*6 */
        int ex4a = -5+8*6 ;
        System.out.println( "a. -5+8*6 = " + ex4a);

        /* b. (55+9)%9 */
        int ex4b = (55+9)%9;
        System.out.println( "b. (55+9)%9 = " + ex4b);

        /* c. 20 + -3*5 /8 */
        double ex4c = 20 + (-3*5)/8;
        System.out.println( "c. 20 + -3*5 / 8 = " + ex4c);

        /* d. 5+15/3*2-8%3 */
        double ex4d = 5+(15/3)*2-8%3;
        System.out.println( "d. 5+15/3*2-8%3 = " + ex4d);

        double cat = 8%3;
        double mixt = 15/3*2;
        double ver= 5 + mixt - cat;
        System.out.println( "Verificare d.: 5+" + mixt + "-" + cat + "= " + ver );

        /* test commit */
    }

}
