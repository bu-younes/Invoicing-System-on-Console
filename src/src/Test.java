package src;

import java.util.Scanner;

public class Test {
    static int shopSettingsCount = 0;
    static  int manageShopItemsCount = 0;
    static int createNewInvoiceCount = 0;
    static  int reportStatisticsCount = 0;
    static   int reportAllInvoicesCount = 0;
    static  int searchInvoiceCount = 0;
    static   int programStatisticsCount = 0;
    static int exitCount = 0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Shop Settings");
            System.out.println("2. Manage Shop Items");
            System.out.println("3. Create New Invoice");
            System.out.println("4. Report: Statistics");
            System.out.println("5. Report: All Invoices");
            System.out.println("6. Search (1) Invoice");
            System.out.println("7. Program Statistics");
            System.out.println("8. Exit");

            System.out.print("\nSelect an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
            
                case 1:
                    shopSettings();
                    Test.shopSettingsCount++;

                    break;
                case 2:
                	 manageShopItems();
                	 manageShopItemsCount++;

                    break;
                case 3:
                    createNewInvoice();
                    createNewInvoiceCount++;
                    break;
                case 4:
                    reportStatistics();
                    reportStatisticsCount++;
                    break;
                case 5:
                    reportAllInvoices();
                    reportAllInvoicesCount++;
                    break;
                case 6:
                    searchInvoice();
                    searchInvoiceCount++;
                    break;
                case 7:
                	programStatistics();
                    programStatisticsCount++;
                    break;
                case 8:
                    exit();
                    exitCount++;
                    
                    System.out.print("Are you sure you want to exit? (y/n) : ");
                    String confirm = scanner.next();
                    if (confirm.equalsIgnoreCase("y")) {
                        System.out.println("Exiting the program");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option between 1-8.");
            }
        }
    }

    private static void exit() {
		// TODO Auto-generated method stub
		
	}

	private static void programStatistics() {
		// TODO Auto-generated method stub

	    System.out.println("Shop Settings: " + shopSettingsCount);
	    System.out.println("Manage Shop Items: " + manageShopItemsCount);
	    System.out.println("Create New Invoice: " + createNewInvoiceCount);
	    System.out.println("Report: Statistics: " + reportStatisticsCount);
	    System.out.println("Report: All Invoices: " + reportAllInvoicesCount);
	    System.out.println("Search (1) Invoice: " + searchInvoiceCount);
	    System.out.println("Program Statistics: " + programStatisticsCount);
	    System.out.println("Exit: " + exitCount);
		
	}

	private static void searchInvoice() {
		// TODO Auto-generated method stub
		
	}

	private static void reportAllInvoices() {
		// TODO Auto-generated method stub
		
	}

	private static void reportStatistics() {
		// TODO Auto-generated method stub
		
	}

	private static void createNewInvoice() {
		// TODO Auto-generated method stub
		
	}

	private static void shopSettings() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nShop Settings:");
            System.out.println("1. Load Data");
            System.out.println("2. Set Shop Name");
            System.out.println("3. Set Invoice Header");
            System.out.println("4. Go Back");

            System.out.print("\nSelect an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Load Data");
                    break;
                case 2:
                    System.out.println("You selected Set Shop Name");
                    break;
                case 3:
                    System.out.println("You selected Set Invoice Header");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please select an option between 1-4.");
            
            }
            
        }
        
    }
    
    private static void manageShopItems() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nManage Shop Items:");
            System.out.println("1. Add Items");
            System.out.println("2. Delete Items");
            System.out.println("3. Change Item Price");
            System.out.println("4. Report All Items");
            System.out.println("5. Go Back");

            System.out.print("\nSelect an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Add Items");
                    break;
                case 2:
                    System.out.println("You selected Delete Items");
                    break;
                case 3:
                    System.out.println("You selected Change Item Price");
                    break;
                case 4:
                    System.out.println("You selected Report All Items");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please select an option between 1-5.");
            }
        }
    } 
    
}
		

