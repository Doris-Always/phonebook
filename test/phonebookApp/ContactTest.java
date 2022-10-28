package phonebookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TODO create a phonebook
//TODO A phonebook has a name
//TODO A phonebook has a number
//TODO A phonebook has a contact address
public class ContactTest {
    Contact contact;
    @BeforeEach
    void setUp(){
        contact= new Contact("Kelechi","house 36,iwaya","omemgboji@yahoo.com","0812254");
    }
    @Test
    public void testThatIHaveAContact(){
        assertNotNull(contact);
    }
    @Test
    public void testThatICanAddANameToTheContact(){
        contact.setName("Nkechi Ekwutosi");
        assertEquals("Nkechi Ekwutosi",contact.getName());
    }
    @Test
    public void testThatICanAddAnAddressToTheContact(){
        contact.setAddress("No 12,oyo street,Anambra");
        assertEquals("No 12,oyo street,Anambra",contact.getAddress());
    }
    @Test
    public void testThatICanAddEmailToMyContact(){
        contact.setEmail("www.seni@gmail.com");
        assertEquals("www.seni@gmail.com",contact.getEmail());
    }

}
