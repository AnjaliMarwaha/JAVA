import java.util.Scanner;

public class J01_Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.format("Your name is %s",name);
    }
}
