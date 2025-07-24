package testes;

public class loopy {
    public static void main(String[] args) {

        int x = 1;
        System.out.println("Before the loop");
        while (x < 101) {
            System.out.println("In the loop");
            System.out.println("Value of x is: " + x);
            x = x + 1;
        }
        System.out.println("After the loop");
    }

}

// em while, o código dentro do loop é executado enquanto a condição for verdadeira.