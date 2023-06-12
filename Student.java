/**
 * This program contains the student,
 * class. Referenced from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-10-06.
 */

public class Student {
    // Creating fields.
    String _firstName;
    String _lastName;
    String _midInt;
    int _grade;
    boolean _iep = false;

    // Creating the constructor if they have a mid name.
    public Student(String firstName, String lastName,
            String midInt, int grade, boolean IEP) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._midInt = midInt;
        this._grade = grade;
        this._iep = IEP;
    }

    // Creatng the constructor if they don't have a mid name'.
    public Student(String firstName, String lastName,
            int grade, boolean IEP) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._midInt = "";
        this._grade = grade;
        this._iep = IEP;
    }

    // Method for printing student name.
    public void print() {
        // Declare variable.
        String name = _firstName;
        final String userIEP;

        // If student does not has mid int.
        if (!_midInt.isEmpty()) {
            name = name + " " + _midInt + " ";
        }

        // Includes the last name.
        name = name + " " + _lastName;

        // If statement if student has IEP.
        if (_iep) {
            userIEP = "has iep";
        } else {
            userIEP = "does not have iep";
        }

        // Display name to console.
        System.out.println(name + " is in grade " + _grade
            + " and " + userIEP + ".");
    }
}
