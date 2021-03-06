package OOP_lab8;

public class Person {
   private String personID;
   private String name;
   private String gender;
   private int age;

   public Person(String personID, String name, String gender, int age){
      this.personID = personID;
      this.name = gender;
      this.gender = gender;
      this.age = age;
   }
   //getter and setter  methods


   @Override
   public String toString() {
      return "Person{" +
              "personID='" + personID + '\'' +
              ", name='" + name + '\'' +
              ", gender='" + gender + '\'' +
              ", age=" + age +
              '}';
   }

   public String getPersonID() {
      return personID;
   }

   public void setPersonID(String personID) {
      this.personID = personID;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}//class
