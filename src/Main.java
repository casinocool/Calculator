import java.util.Scanner;

public class Main {
    public static String calc(String input){
        String[] strings=input.split("\\s+");
        if(strings.length!=3){
            throw new IllegalArgumentException("Выражение не подходит по условию");
        }
        int a=Integer.parseInt(strings[0]);
        int b=Integer.parseInt(strings[2]);
        if(a<1 || a>10 || b>10 || b<1){
            throw new IllegalArgumentException("Выражение не подходит по условию");
        }
        switch (strings[1]){
            case "+":
                return (a+b)+"";
            case "-":
                return (a-b)+"";
            case "*":
                return (a*b)+"";
            case "/":
                return (a/b)+"";
            default:
                throw new IllegalArgumentException("Выражение не подходит по условию");
        }
    }
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
            System.out.println(calc(input));


        }
    }