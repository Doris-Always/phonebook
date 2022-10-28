package phonebookApp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//TODO that i can add contact/
//TODO that i can add more than 1 contact/
//TODO that i can delete contact/
//TODO that i can clear all contact
//TODO that i can replace contact
//TODO that i can get contact by index

public class PhonebookTest {
   Phonebook contactList = new Phonebook();

   @Test
    public void testThatPhoneBookExist(){
       assertNotNull(contactList);
   }



   @Test
    public void testThatICanAddContactToPhoneBook(){
       Phonebook contactList = new Phonebook();
       contactList.addContact(new Contact("Doris","no 12,iwaya","www.okolo@gmail.com","909876555"));
      contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
       assertEquals(2,contactList.checkSizeOfContact());

   }

   @Test
    public void testThatICanDeleteContactFromPhonebook(){
       Phonebook contactList = new Phonebook();
       Contact c1 = contactList.addContact(new Contact("Doris","no 12,iwaya","www.okolo@gmail.com","909876555"));
       Contact c2 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
       contactList.deleteContact(c1);
       assertEquals(1,contactList.checkSizeOfContact());
   }
   @Test
    public void testThatICanGetContactByName(){
       Phonebook contactList = new Phonebook();
       Contact c1 = contactList.addContact(new Contact("Doris","no 12,iwaya","www.okolo@gmail.com","909876555"));
       Contact c2 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
       Contact c3 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
       List<Contact> contacts = contactList.getContactByName("otop");
       assertTrue(contacts.contains(c2));
       assertTrue(contacts.contains(c3));
   }

   @Test
    public void testThatICanGetContactByNumber(){
       Phonebook contactList = new Phonebook();
       Contact c1 = contactList.addContact(new Contact("Doris","no 12,iwaya","www.okolo@gmail.com","909876555"));
       Contact c2 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
       Contact c3 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
       List<Contact> contacts = contactList.getContactByNumber("909876555");
       assertTrue(contacts.contains(c2));
   }
   @Test
   public void testThatICanGetAllMyPhoneBookEntry(){
      Phonebook contactList = new Phonebook();
      Contact c1 = contactList.addContact(new Contact("Doris","no 12,iwaya","www.okolo@gmail.com","909876555"));
      Contact c2 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
      Contact c3 = contactList.addContact(new Contact("otop","no 12,ojuelegba","www.chickenhead@gmail.com","909876555"));
      List<Contact> theContact = new ArrayList<>();
      theContact.add(c1);
      theContact.add(c2);
      theContact.add(c3);
      assertTrue(theContact.equals(contactList.getAllContact()));
   }
}
