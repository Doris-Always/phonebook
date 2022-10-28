package phonebookApp;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private final List<Contact> contacts = new ArrayList<>();
   private final List<Contact> recurringContacts = new ArrayList<>();
//   private int count = 0;

    public Contact addContact(Contact contact) {
        contacts.add(contact);
        return contact;
    }

    public int checkSizeOfContact() {
        return contacts.size();
    }

    public void deleteContact(Contact contact) {
     contacts.remove(contact);

    }

    public List<Contact> getContactByName(String name) {
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                recurringContacts.add(contact);
            }
        }
        return recurringContacts;
    }

    public List<Contact> getContactByNumber(String phoneNumber) {
        for (Contact contact: contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
//                String phone = contact.getPhoneNumber();
                recurringContacts.add(contact);
            }
        }
        return recurringContacts;
    }

    public List<Contact> getAllContact() {
        List<Contact> myContacts = new ArrayList<>();
        for (Contact contact: contacts) {
            if (contact != null) myContacts.add(contact);
        }
        return myContacts;
    }

}
