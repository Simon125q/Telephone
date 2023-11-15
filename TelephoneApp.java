import java.util.Map;
import java.util.TreeMap;

public class TelephoneApp {
    public static void main() 
    {
        Person  p1 = new Person("Szymon", "Omiecinski", "98-105",
         "Wodzierady", "Lesnica", "55", "48", "123 456 789");

        TreeMap<TelephoneNumber, TelephoneEntry> telephoneEntries = new TreeMap<TelephoneNumber, TelephoneEntry>();
        telephoneEntries.put(p1.getPhoneNumber(), p1);
        
        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = telephoneEntries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<TelephoneNumber, TelephoneEntry> pair = iterator.next();
            pair.getValue().description();
        }
    }
}
