package homework.lab9.ex2_2;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap(); // Use PhoneBookMap implementation

        // Comment the above line and uncomment the line below to switch implementation
        // PhoneBook pb = new PhoneBookArray();

        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByLastName("Poppi"));

        // Student with phone number "1111" does not exist
        System.out.println(pb.searchByNumber("1111"));

        // Delete the entry with phone number "24564"
        pb.deleteByNumber("24564");

        // After deletion, the entry with last name "Poppi" should not exist
        System.out.println(pb.searchByLastName("Poppi"));
    }
}

