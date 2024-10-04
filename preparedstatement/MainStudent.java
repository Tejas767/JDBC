package com.preparedstatement;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student operation = new Student();
        int option = 0;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("\n*************************************************");
            System.out.println("            😊 Student Management System 😊       ");
            System.out.println("*************************************************");
            System.out.println("  1. ➤ Insert New Student Data");
            System.out.println("  2. ➤ Update Existing Student Data");
            System.out.println("  3. ➤ Delete Student Data");
            System.out.println("  4. ➤ Display All Student Records");
            System.out.println("  5. ➤ Exit Program");
            System.out.println("*************************************************");
            System.out.print("👉 Choose Option: ");

            option = sc.nextInt(); 

            switch(option)
            {
                case 1:
                    operation.insert();
                    break;

                case 2:
                    operation.update();
                    break;

                case 3:
                    operation.delete();
                    break;

                case 4:
                    operation.display();
                    break;

                case 5: 
                    System.out.println(" ___________________ Program Exited (^_^) ______________________ ");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.");
                    break;
            }

        } while(option != 5);  

    }


	}


