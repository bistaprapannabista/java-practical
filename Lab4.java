class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void vote() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Sorry, " + name + ". You are not eligible to vote.");
        } else {
            System.out.println(name + " has voted successfully!");
        }
    }
}

public class Lab4 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 20);
        Person person2 = new Person("Bob", 16);

        try {
            person1.vote();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            person2.vote();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
