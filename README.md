**# Bank-Account-JAVA**Sure! Here’s the README for the "ContaBanco" project in English:

---

# ContaBanco Project

This project is a simple Java application that takes bank account information via the terminal and displays a confirmation message to the user. The goal is to demonstrate basic usage of variables, terminal input, and string manipulation.

## Requirements

- Java 8 or higher
- Preferred IDE or text editor

## Project Structure

The project contains a single class:

- `ContaTerminal.java`: This class handles the main logic of the program.

## Account Attributes

The program will prompt the user for the following information:

- **Number**: Account number (Type: Integer)
- **Branch**: Branch code (Type: Text)
- **Client Name**: Name of the client (Type: Text)
- **Balance**: Account balance (Type: Decimal)

## Instructions for Running

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/conta-banco.git
   ```

2. **Navigate to the Project Directory**

   ```bash
   cd conta-banco
   ```

3. **Compile the Project**

   ```bash
   javac ContaTerminal.java
   ```

4. **Run the Program**

   ```bash
   java ContaTerminal
   ```

5. **Follow the Instructions in the Terminal**

   The program will request the following information:

   ```plaintext
   Please enter the Branch number:
   ```
   *Enter the branch number and press ENTER.*

   ```plaintext
   Please enter the Account number:
   ```
   *Enter the account number and press ENTER.*

   ```plaintext
   Please enter the Client Name:
   ```
   *Enter the client name and press ENTER.*

   ```plaintext
   Please enter the Account Balance:
   ```
   *Enter the account balance and press ENTER.*

6. **Confirmation Message**

   After entering the data, the program will display the following message:

   ```plaintext
   Hello [Client Name], thank you for creating an account with our bank. Your branch is [Branch], account [Number], and your balance of [Balance] is now available for withdrawal.
   ```

   Where `[Client Name]`, `[Branch]`, `[Number]`, and `[Balance]` will be replaced with the information provided by the user.

## Code for `ContaTerminal.java`

```java
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Branch number:");
        String branch = scanner.nextLine();

        System.out.println("Please enter the Account number:");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Please enter the Client Name:");
        String clientName = scanner.nextLine();

        System.out.println("Please enter the Account Balance:");
        double balance = scanner.nextDouble();

        System.out.println("Hello " + clientName + ", thank you for creating an account with our bank. Your branch is " + branch + ", account " + number + ", and your balance of " + balance + " is now available for withdrawal.");
    }
}
```

## Notes

- Make sure to enter the data as requested by the program to avoid errors.
- The code is set up to handle basic inputs and can be modified to include additional validations if needed.
