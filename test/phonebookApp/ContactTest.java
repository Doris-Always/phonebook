package phonebookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TODO create a phonebook
//TODO A phonebook has a name
//TODO A phonebook has a number
//TODO A phonebook has a contact address
public class PhoneBookTest {
    Phonebook phonebook;
    @BeforeEach
    void setUp(){
        phonebook = new Phonebook("Kelechi","house 36,iwaya","omemgboji@yahoo.com","0812254");
    }
    @Test
    public void testThatIHaveAPhonebook(){
        assertNotNull(phonebook);
    }
    @Test
    public void testThatICanAddAddANameToThePhoneBook(){
        phonebook.setName("Nkechi Ekwutosi");
        assertEquals("Nkechi Ekwutosi",phonebook.getName());
    }
    @Test
    public void testThatICanAddAnAddressToThePhoneBook(){
        phonebook.setAddress("No 12,oyo street,Anambra");
        assertEquals("No 12,oyo street,Anambra",phonebook.getAddress());
    }
    @Test
    public void testThatICanAddEmailToMyPhonebook(){
        phonebook.setEmail("www.seni@gmail.com");
        assertEquals("www.seni@gmail.com",phonebook.getEmail());
    }

    @Test
    public void testThatICanAddMoreThanOneNameInMyPhonebook(){

    }

}
