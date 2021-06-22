import java.util.ArrayList;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Person> myPersons = new ArrayList<Person>();
        InputOutputHandler myHandler = new InputOutputHandler();

        myHandler.showMessage("Input person number");
        Integer numberOfPerson = myHandler.getInputInt();
        for (int i = 0; i < numberOfPerson; i++) {
            Person myPerson = new Person();
            myPerson.load(myHandler);
            myPersons.add(myPerson);
        }
        FileWriter nFile = new FileWriter("sample1.txt");
        for (int i = 0; i < myPersons.size(); i++) {
            System.out.println(myPersons.get(i).getFirstName());
            nFile.write("First Name: " + myPersons.get(i).getFirstName() + " Id: " + myPersons.get(i).getId() + " Height: " + myPersons.get(i).getHeight() + "\n");
        }
        nFile.close();
        
        //myPersons.forEach(s -> System.out.println(s.getFirstName()));
        //Vqvesti iz file

    }
}


