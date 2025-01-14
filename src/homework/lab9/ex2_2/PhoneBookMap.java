package homework.lab9.ex2_2;
import java.util.HashMap;
public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;
    public PhoneBookMap(){
        this.phoneBook = new HashMap<>();
    }
    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.phone, p);
    }

    @Override
    public Student searchByName(String name) {
        for(Student student : phoneBook.values()){
            if(student.name.equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for(Student student : phoneBook.values()){
            if(student.lastname.equals(lastname)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
