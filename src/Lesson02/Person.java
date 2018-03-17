package Lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
        System.out.print("Citizen with name / surname :" + firstName + " / " + secondName + " is created");
        System.out.println();
    }

    static {
        System.out.println("Initial loading");
    }

    {
        System.out.println(count + " object is loading");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Person FirstPerson = new Person("Z", "W", 189);
        Person SecondPerson = new Person("J", "W", 189);
        Person NormalPerson = new Person("Azx", "Jojojoj", 19);

        if (FirstPerson.equals(SecondPerson)){
            System.out.println("They are identical");
        } else {
            System.out.println("Different persons");
        }
//Test commit from home !


    }



}
