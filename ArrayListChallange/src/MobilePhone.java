import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> contact = new ArrayList<>();
    private int indexOfContact = 0;
    private Contacts[] newContacts = new Contacts[10];
    private Scanner userInput = new Scanner(System.in);




    public void storeContact(){
        System.out.print("Enter the name of the contact: ");
        String contactName = userInput.nextLine();

        System.out.print("Enter the phone number: ");
        int contactNumber = userInput.nextInt();
        userInput.nextLine();

        newContacts[indexOfContact] = new Contacts(contactName,contactNumber);
        contact.add(newContacts[indexOfContact]);
        indexOfContact++;

    }

    public void showContacts(){

        if(contact.size() == 0){
            System.out.println("There are no contacts.");
        }
        else {
            for (int i = 0; i < contact.size(); i++)
            {
                System.out.println("The contact at index: " + i + "\n" + "------------------------------------");
                System.out.println("The contact name: " + contact.get(i).getContactName() + " \n" + "The contact number: " + contact.get(i).getContactNumber());
                System.out.println("------------------------------------");

            }
        }

    }

    public void modifyContact(){

        if(contact.size() > 0) {
            System.out.println("Enter the index of the contact u want to modify: ");
            int contactIndex = userInput.nextInt();
             userInput.nextLine();

              System.out.println("1. Name.");
              System.out.println("2. Number.");
              System.out.println("3. Both.");
              System.out.print("What do you want to change: ");
              String choice = userInput.nextLine();


               switch (choice) {
                 case "1":
                      System.out.println("Enter the new name: ");
                     String newName = userInput.nextLine();
                        contact.get(contactIndex).setContactName(newName);
                     break;
                    case "2":
                        System.out.println("Enter the new number: ");
                        int newNumber = userInput.nextInt();
                        contact.get(contactIndex).setContactNumber(newNumber);
                        break;
                  case "3":
                        System.out.println("Enter the new name: ");
                        String newName1 = userInput.nextLine();
                        contact.get(contactIndex).setContactName(newName1);
                        System.out.println("Enter the new number: ");
                        int newNumber1 = userInput.nextInt();
                        contact.get(contactIndex).setContactNumber(newNumber1);
                        break;
                  default:
                        System.out.println("Invalid input.");

                }
        }
        else
             System.out.println("There are no contacts to modify.");

    }

    public void removeContact(){
        if(contact.size() > 0){
            System.out.print("Enter the index of the contact to remove");
            int contactIndex = userInput.nextInt();
            userInput.nextLine();

            contact.remove(contactIndex);
            System.out.println("Contact at index " + contactIndex + " removed." );
        }
        else
            System.out.println("There are no contact to remove.");



    }

    public void removeAllContacts(){
        if(contact.size() > 0) {
            contact.removeAll(contact);
            System.out.println("Removed all contacts.");
        }
        else
            System.out.println("There are no contacts to remove");
    }
}
