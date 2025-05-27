import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("   Welcome to Java Application   ");
        System.out.println("=================================");
        
        // Display current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date & Time: " + now.format(formatter));
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Process and display information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        // Determine age category
        String category = getAgeCategory(age);
        System.out.println("Category: " + category);
        
        // Calculate years until retirement (assuming retirement at 65)
        if (age < 65) {
            int yearsToRetirement = 65 - age;
            System.out.println("Years until retirement: " + yearsToRetirement);
        } else {
            System.out.println("You are at or past retirement age!");
        }
        
        // Simple calculation demonstration
        System.out.println("\n--- Simple Calculator ---");
        System.out.println("Let's do some basic math!");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform calculations
        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
        
        // Display system information
        System.out.println("\n--- System Information ---");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
        
        System.out.println("\nThank you for using the Java Application!");
        System.out.println("Program executed successfully in Docker container.");
        
        scanner.close();
    }
    
    /**
     * Determines age category based on age
     * @param age the person's age
     * @return age category as string
     */
    private static String getAgeCategory(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teenager";
        } else if (age < 60) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}