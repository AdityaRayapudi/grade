import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Takes input for grade
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your grade:");
int number = Integer.valueOf(scanner.nextLine());

//Commpares number/grade to see what letter it is
if (97 <= number){
    System.out.println("You got an A+");
}

else if (90 <= number){
    System.out.println("You got an A");

}

else if (80 <= number){
    System.out.println("You got an B");

}

else if (70 <= number){
    System.out.println("You got an C");

}

else if (60 <= number){
    System.out.println("You got an D");

}

else if (number > 60){
    System.out.println("You got an F");

}

else {
    System.out.println("Please Try Again");

}






}

}
