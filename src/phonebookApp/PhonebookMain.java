package phonebookApp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PhonebookMain {
//    private static final List<Phonebook> contacts = new ArrayList<>();
    private static final  Scanner input = new Scanner(System.in);
    List<Contact> contacts = new ArrayList<>();
    private static final Contact contact = new Contact("Kelechi","house 36,iwaya","omemgboji@yahoo.com","0812254");


    public static void main(String[] args) {
        PhonebookMain phonebookMain = new PhonebookMain();
        phonebookMain.addFullDetails();
        phonebookMain.printHeader();
        phonebookMain. printOtherOutput();

    }
    public void addFullDetails()  {

        System.out.println("Add name: ");
        contact.setName( input.nextLine());

        System.out.println("\nAdd Address: ");
        contact.setAddress(input.nextLine());

        System.out.println("\nAdd Email: ");
        contact.setEmail(input.nextLine());


        System.out.println("\nAdd phone number: ");
        contact.setPhoneNumber(input.nextLine());
    }
    public void printHeader(){
       System.out.println("\n------PHONEBOOK------");
    }

    public String printOtherOutput(){
        StringBuilder output = new StringBuilder();
        output
            .append("\nNAME:").append(printName())
                .append("\nADDRESS:").append(printAddress())
                .append("\nEMAIL:").append(printEmail())
                .append("\nTEL:").append(printPhoneNumber());
        return output.toString();
    }
    public String printName(){
        String name = contact.getName();
       System.out.print("\nNAME: \t\t"+ name);
        return name;
    }

    public String printAddress(){
        String address = contact.getAddress();
        System.out.print("\nADDRESS: \t"+ address);
        return address;
    }
    public String printEmail(){
        String email = contact.getEmail();
        System.out.print("\nEMAIL: \t\t"+ email);
        return email;
    }
    public String printPhoneNumber(){
        String phoneNumber = contact.getPhoneNumber();
        System.out.print("\nTEL: \t\t"+ phoneNumber);
        return phoneNumber;
    }


}
