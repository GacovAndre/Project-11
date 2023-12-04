import java.util.Scanner;

public class KalkulatorV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Vnesi go prviot broj:");
        double a = input.nextDouble();

        System.out.println("Vnesi ja posakuvanata operacija:");
        String operacija = scan.nextLine();

        System.out.println("Vnesi go vtoriot broj:");
        double b = input.nextDouble();
        double c;

        switch (operacija) {
            case "+":
                c = a + b;
                System.out.println(a + operacija + b + "=" + c);
                break;
            case "-":
                c = a - b;
                System.out.println(a + operacija + b + "=" + c);
                break;
            case "*":
                c = a * b;
                System.out.println(a + operacija + b + "=" + c);
                break;
            case "/":
                if (b != 0) {
                    c = a / b;
                    System.out.println(a + operacija + b + "=" + c);
                } else {
                    System.out.println("Nemozhe da se deli so 0.");
                }
                break;
            case "%":
                c = a % b;
                System.out.println(a + operacija + b + "=" + c);
                break;
            case "^":
                c = Math.pow(a, b);
                System.out.println(a + operacija + b + "=" + c);
                break;
            case "sqrt":
                if (a >= 0) {
                    c = Math.sqrt(a);
                    System.out.println("sqrt(" + a + ")=" + c);
                } else {
                    System.out.println("Koren ne e definiran za negativni broevi.");
                }
                break;
            case "abs":
                c = Math.abs(a);
                System.out.println("|" + a + "|=" + c);
                break;
            case "round":
                c = Math.round(a);
                System.out.println("round(" + a + ")=" + c);
                break;
            default:
                System.out.println("Proverete sto imate napisano.");
                break;
        }
    }
}
