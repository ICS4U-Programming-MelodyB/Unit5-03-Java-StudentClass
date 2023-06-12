import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program contains the main
 * class. Referenced from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-10-06.
 */

public class Main {
    public static void main(String[] args) {
        // Pass path to file as parameter.
        final File file = new File("input.txt");

        try {
            // Create a new list.
            final List<Student> listOfStudents = new ArrayList<>();

            // Create Scanner object to read from file.
            final Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                // Read line as string.
                final String newLine = sc.nextLine();

                // In case the user enters an empty line,
                // display no input found.
                if ("".equals(newLine)) {
                    System.out.println("There is no data on this line.");
                    System.out.println("");
                    continue;
                }

                // Declare array & variables.
                final String[] arraySpace = newLine.split(" ");
                final String firstName = arraySpace[0];
                final String lastName;
                String midInti = "";
                int grade = 0;
                boolean iep = false;
                Student student;

                // Checks to see if middle name
                // is present.
                if (arraySpace.length >= 5) {
                    // Sets specified index.
                    midInti = arraySpace[1];
                    lastName = arraySpace[2];
                    grade = Integer.parseInt(arraySpace[3]);
                    iep = arraySpace[4].equals("y");
                } else {
                    lastName = arraySpace[1];
                    grade = Integer.parseInt(arraySpace[2]);
                    // To see if IEP is present.
                    iep = arraySpace[3].equals("y");
                }

                // Format information & calls method.
                if (!midInti.isEmpty()) {
                    // Create a new Student object and add it to the list.
                    student = new Student(firstName, lastName,
                        midInti, grade, iep);
                    student.print();
                } else {
                    // Create a new Student object and add it to the list.
                    student = new Student(firstName,
                            lastName, grade, iep);
                    student.print();
                }

                // Add student to list.
                listOfStudents.add(student);

                // Declare variable & display how
                // many students are in said class.
                final int amountStudent = listOfStudents.size();
                System.out.println("There are " + amountStudent
                        + "  students in the class.");
                System.out.println("");
            }
            // Closes scanner
            sc.close();
        } catch (IOException error) {
            // Displays error to user.
            System.out.println("An error occurred: "
                    + error.getMessage());
        }
    }
}
