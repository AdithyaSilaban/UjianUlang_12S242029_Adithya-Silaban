package smartwallet.driver;

import java.util.ArrayList;
import java.util.Scanner;

import smartwallet.model.Account;

public class driver1 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> account = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");

            if (parts[0].equals("create-account")) {
                String name = parts[1];
                String username = parts[2];

                Account acc = new Account(name,username);
                account.add(acc);
            }
        }

        for (Account acc : account) {
            System.out.println(
                acc.getUsername() + "|" +
                acc.getName() + "|" +
                acc.getBalance() 
            );
        }

        scanner.close();
        
    


    }

}
