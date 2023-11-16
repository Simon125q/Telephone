import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class TelephoneApp {
    public static void main(String[] args) 
    {
        Person  p1 = new Person("Szymon", "Omiecinski", "98-105",
         "Wodzierady", "Lesnica", "55", "48", "123 456 789");
        Person  p2 = new Person("Jan", "Kowalski", "00-999",
         "Lodz", "Piotrkowska", "110a", "48", "564 565 667");
        Person  p3 = new Person("Kamil", "Slimak", "98-089",
         "Warszawa", "Wiejska", "34", "48", "123 435 786");
        Person  p4 = new Person("John", "Smith", "34-340",
         "Las Vegas", "Main Street", "99", "356", "098 123 645");

        Company  c1 = new Company("ABB", "56-150", "Aleksandrow Lodzki", "Placydolna", 
        "21", "48", "234 156 389");
        Company  c2 = new Company("Hexagon", "78-456", "Lodz", "Piotrkowska", 
        "101b", "48", "454 545 454");
        Company  c3 = new Company("Tesla", "78-098", "New York", "Wall Street", 
        "69/70", "356", "111 111 110");
        Company  c4 = new Company("Google", "87-345", "Silicon Valley", "Long street", 
        "347", "387", "678 345 321");

        TreeMap<TelephoneNumber, TelephoneEntry> contacts = new TreeMap<TelephoneNumber, TelephoneEntry>();
        contacts.put(p1.getPhoneNumber(), p1);
        contacts.put(p2.getPhoneNumber(), p2);
        contacts.put(p3.getPhoneNumber(), p3);
        contacts.put(p4.getPhoneNumber(), p4);
        contacts.put(c1.getPhoneNumber(), c1);
        contacts.put(c2.getPhoneNumber(), c2);
        contacts.put(c3.getPhoneNumber(), c3);
        contacts.put(c4.getPhoneNumber(), c4);
        
        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<TelephoneNumber, TelephoneEntry> pair = iterator.next();
            pair.getValue().description();
        }
    }
}
