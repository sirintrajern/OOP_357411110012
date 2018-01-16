package OOP_LAB4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StedentData {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static String getname() throws IOException {
      System.out.print("Enter your name:");
      return reader.readLine();
    }//getname
    public static String getAddress() throws IOException {
        System.out.print("Enter your address:");
        return reader.readLine();
    }
    public static String getStdID() throws IOException {
        System.out.print("Enter your ID:");
        return reader.readLine();
}
    public static String getFaculty() throws IOException {
        System.out.print("Enter your major and faculty:");
        return reader.readLine();
    }
    public static String getEmail() throws IOException {
        System.out.print("Enter your email:");
        return reader.readLine();
    }
    public static void main(String[] args) throws IOException {
       String name = getname();
       String address = getAddress();
       String id = getStdID();
       String Faculty = getFaculty();
       String Email = getEmail();
       System.out.println(name+"\n"+address+"\n"+id+"\n"+Faculty+"\n"+Email);
       System.out.println(getname()+"\n"+getAddress());
    }
}//class
