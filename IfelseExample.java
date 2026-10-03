 import java.util.Scanner;
 public class IfelseExample {
     public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the waste collected in kg: ");
  double wasteCollected = sc.nextDouble();
  if (wasteCollected >= 100){
    System.out.println("Collection Target Achieved");
  } else{ 
    System.out.println("More Waste Collection Required");
  }
    }
 }
    