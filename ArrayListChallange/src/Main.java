import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        MobilePhone myPhone = new MobilePhone();

        boolean exit = false;
        optionSelection();

        do{
            String option = userInput.nextLine();

            switch(option){

                case "0":
                    optionSelection();
                    break;
                case "1":
                    myPhone.showContacts();
                    break;
                case "2":
                    myPhone.storeContact();
                    break;
                case "3":
                    myPhone.modifyContact();
                    break;
                case "4":
                    myPhone.removeContact();
                    break;
                case "5":
                    myPhone.removeAllContacts();
                    break;
                case "6":
                    System.out.println("Exiting.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input.");
            }





        }while(!exit);


    }
    public static void optionSelection(){
        System.out.println("0. View the options");
        System.out.println("1. View the saved contacts.");
        System.out.println("2. Store new contact.");
        System.out.println("3. Modify existing contact");
        System.out.println("4. Remove existing contact");
        System.out.println("5. Remove all contacts");
        System.out.println("6. Quit");
        System.out.print("Chose an option: ");



    }
}