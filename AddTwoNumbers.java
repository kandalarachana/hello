public class AddTwoNumbers {
public static void main(string[] args) {
if (args.length < 2) {
System.out.println("please provide two numbers as arguments.");
return;
}
//parse the numbers from command-line arguments
int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);
//calculate the sum
int sum = num1 + num2;
//Display the result
system.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
}
}
