import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Birthday: ");
        String birthday = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        Person person = new Person(firstName, middleName, lastName, age, birthday, address);
        System.out.println("\nPersonal Information:");
        System.out.println("Full Name: " + person.getFirstName() + " " + person.getMiddleName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday());
        System.out.println("Address: " + person.getAddress());

        boolean updateInfo = true;

        while (updateInfo) {
            System.out.print("Do you want to update your information? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter New First Name: ");
                String newFirstName = scanner.nextLine();
                System.out.print("Enter New Middle Name: ");
                String newMiddleName = scanner.nextLine();
                System.out.print("Enter New Last Name: ");
                String newLastName = scanner.nextLine();
                System.out.print("Enter New Age: ");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter New Birthday: ");
                String newBirthday = scanner.nextLine();


                person.setFirstName(newFirstName);
                person.setMiddleName(newMiddleName);
                person.setLastName(newLastName);
                person.setAge(newAge);
                person.setBirthday(newBirthday);


                System.out.println("\nUpdated Information:");
                System.out.println("Full Name: " + person.getFirstName() + " " + person.getMiddleName() + " " + person.getLastName());
                System.out.println("Age: " + person.getAge());
                System.out.println("Birthday: " + person.getBirthday());
            } else if (choice.equalsIgnoreCase("no")) {
                updateInfo = false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
}
