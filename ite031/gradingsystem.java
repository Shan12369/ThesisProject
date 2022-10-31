// importing Scanner object
import java.util.Scanner;

// create class Student
class Student {
    // defining data members
    private String name, subject, course;
    public double prelim, midterm, finalGrade, average;
    public int id, age;

    // methods


    // setter
    // accepts inputs from user and set values as Student details
    public void setStudentDetails(int Id, String Name, double Prelim, double Midterm, double FinalGrade, int Age, String Subject, String Course) {
        this.id = Id;
        this.name = Name;
        this.prelim = Prelim;
        this.midterm = Midterm;
        this.finalGrade = FinalGrade;
        this.average = Math.round(((Prelim + Midterm + FinalGrade) / 3) * 100.0) / 100.0;
        this.age = Age;
        this.subject = Subject;
        this.course = Course;
    }

    // getters
    // when called,

    // returns student id
    public int getId() {
        return this.id;
    }

    // returns student name
    public String getName() {
        return this.name;
    }

    // returns student prelim grade
    public double getPrelim() {
        return this.prelim;
    }

    // returns midterm grade
    public double getMidterm() {
        return this.midterm;
    }

    // returns final grade
    public double getFinal() {
        return this.finalGrade;
    }

    // returns average
    public double getAverage() {
        return this.average;
    }

    // returns student age
    public int getAge() {
        return this.age;
    }

    // returns subject
    public String getSubject() {
        return this.subject;
    }

    // returns course
    public String getCourse() {
        return this.course;
    }

    // accepts index value from array and prints student details
    public void display(int index) {
        System.out.println("\nRECORD #" + (index+1));
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Course : " + course);
        System.out.println("Prelim : " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Final  : " + finalGrade);
        System.out.println("Average: " + average);
    }

}

// our main class grading system
class GradingSystem {

    // main method
    public static void main(String[] args) {

        // declaring and initializing variables need in our program
        String name, subject, course;
        double prelim, midterm, finalGrade;
        boolean flag = true;
        int choice, i=5, id, age;

        // create a students array of size 20
        Student[] students = new Student[20];

        // initialize students indexes and assign default values of 5 elements
        students[0] = new Student();
        students[0].setStudentDetails(1, "Manny Pacquiao", 94, 95, 96, 42, "Programming 101", "BSIT");
        students[1] = new Student();
        students[1].setStudentDetails(2, "Ferdinand Marcos", 93, 98, 96, 52, "Programming 102", "BSCS");
        students[2] = new Student();
        students[2].setStudentDetails(3, "Leni Robredo", 89, 90, 99, 50, "Programming 103", "BSIT");
        students[3] = new Student();
        students[3].setStudentDetails(4, "Ping Lacson", 91, 95, 97, 60, "Programming 101", "BSCS");
        students[4] = new Student();
        students[4].setStudentDetails(5, "Isko Moreno", 94, 92, 93, 42, "Programming 102", "BSIT");

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // run a loop to roll the program until user exits
        while(flag) {
            // display menus
            System.out.println("\n== STUDENT GRADING SYSTEM ==");
            System.out.println("[1] Add Data");
            System.out.println("[2] Edit/Update Data");
            System.out.println("[3] Delete Data");
            System.out.println("[4] Display All Data");
            System.out.println("[5] Exit");
            System.out.print("Select: ");

            // get user choice
            choice = sc.nextInt();
            // check user choices
            switch(choice) {
                case 1: // run this code if user choices option 1
                    System.out.println("\nADD NEW INFO:\n");
                    // get student id
                    System.out.print("Enter Student ID   : ");
                    id = sc.nextInt();
                    // get student name
                    sc.nextLine();
                    System.out.print("Enter Student Name : ");
                    name = sc.nextLine();
                    // get student age
                    System.out.print("Enter Student Age  : ");
                    age = sc.nextInt();
                    // get subject
                    sc.nextLine();
                    System.out.print("Enter Subject      : ");
                    subject = sc.nextLine();
                    // get course
                    System.out.print("Enter Course       : ");
                    course = sc.nextLine();
                    // get prelim grade
                    System.out.print("Enter Prelim Grade : ");
                    prelim = sc.nextDouble();
                    // get midterm grade
                    System.out.print("Enter Midterm Grade: ");
                    midterm = sc.nextDouble();
                    // get final grade
                    System.out.print("Enter Final Grade  : ");
                    finalGrade = sc.nextDouble();
                    // initialize an array element for new Student
                    students[i] = new Student();
                    // call a method to set details for student
                    students[i].setStudentDetails(id, name, prelim, midterm, finalGrade, age, subject, course);
                    // print a message to inform a successful transction
                    System.out.println("\nNew Student Record Added Successfully!\n");
                    i++; // increment i or array index by 1
                    break; // transfer control to while loop

                case 2:
                    // check if students array is empty
                    if(i == 0) {
                        // if array is empty, display this message
                        System.out.println("\nNo Available Data Yet!\n");
                    } else {
                        // declare and initialize variables
                        boolean found = false;
                        int idx = 0;
                        // ask user to enter student id to update
                        System.out.print("\nEnter Student Id to Edit: ");
                        id = sc.nextInt();
                        // loop thru array elements
                        for(int x=0; x<i; x++) {
                            // check if array element student id matches the id
                            if(students[x].id == id) {
                                Student s = students[x]; // if found, assign element to s variable and display its student details
                                System.out.println("\nID     : " + s.getId() + "\nName   : " + s.getName() + "\nAge    : " + s.getAge() + "\nSubject: " + s.getSubject() + "\nCourse : " + s.getCourse() + "\nPrelim : " + s.getPrelim() + "\nMidterm: " + s.getMidterm() + "\nFinal  : " + s.getFinal() + "\nAverage: " + s.getAverage() + "\n");
                                found = true; // set found to true
                                idx = x; // assign i to idx
                                break; // stop the loop
                            }
                        }
                        // if found is true
                        if(found) {
                            // ask user to enter new values for the students details
                            System.out.println("\nUPDATE:");
                            System.out.print("Enter Student Id   : ");
                            int newId = sc.nextInt();

                            sc.nextLine();
                            System.out.print("Enter Student Name : ");
                            name = sc.nextLine();

                            System.out.print("Enter Student Age  : ");
                            age = sc.nextInt();

                            sc.nextLine();
                            System.out.print("Enter Subject      : ");
                            subject = sc.nextLine();

                            System.out.print("Enter Course       : ");
                            course = sc.nextLine();

                            System.out.print("Enter Prelim Grade : ");
                            prelim = sc.nextDouble();

                            System.out.print("Enter Midterm Grade: ");
                            midterm = sc.nextDouble();

                            System.out.print("Enter Final Grade  : ");
                            finalGrade = sc.nextDouble();

                            // update student details
                            students[idx].setStudentDetails(newId, name, prelim, midterm, finalGrade, age, subject, course);
                            System.out.println("\nStudent Record Updated Successfully!\n");
                        } else {
                            // display this message if student id was not found
                            System.out.println("\nStudent Record with id " + id + " not found!\n");
                        }
                    }

                    break;

                case 3:
                    // check if students array is empty
                    if(i == 0) {
                        System.out.println("\nNo Available Data Yet!\n");
                    } else {
                        // declare and initialize variables
                        boolean found = false;
                        int idx = 0, j = 0;

                        // ask user to enter student id they want to delete
                        System.out.print("\nEnter Student Id to Delete: ");
                        id = sc.nextInt();

                        // loop thru array of students to find the id
                        for(int x=0; x<i; x++) {
                            if(students[x].id == id) {
                                Student s = students[x]; // assign aray element to var s and display details
                                System.out.println("\nID     : " + s.getId() + "\nName   : " + s.getName() + "\nAge    : " + s.getAge() + "\nSubject: " + s.getSubject() + "\nCourse : " + s.getCourse() + "\nPrelim : " + s.getPrelim() + "\nMidterm: " + s.getMidterm() + "\nFinal  : " + s.getFinal() + "\nAverage: " + s.getAverage() + "\n");
                                found = true;
                                idx = x;
                                break;
                            }
                        }

                        // if student was found
                        if(found) {
                            // ask confirmation to delete element
                            System.out.print("\nDelete this record? y/n  ");
                            char confirm = sc.next().charAt(0);

                            // check if user entered y or Y and delete element from aray
                            if(confirm == 'y' || confirm == 'Y') {
                                for(int x=0; x<i; x++) {
                                    if(students[x].id != id) {
                                        students[j] = students[x]; // reassign students elements without a student with id to delete
                                        j++; // add 1 to j
                                    }
                                }
                                System.out.println("\nStudent Record Deleted Successfully!\n");
                                i = j; // assign new array count to i
                            }
                        } else {
                            System.out.println("\nStudent Record with id " + id + " not found!\n");
                        }
                    }

                    break;

                case 4:
                    // check if student array is empty
                    if(i == 0) {
                        System.out.println("\nNo Available Data Yet!\n");
                    } else {
                        // loop thru array elements and display each student details
                        for(int x=0; x<i; x++) {
                            Student s = students[x];
                            s.display(x);
                        }
                    }

                    break;

                case 5:
                    System.out.println("\nProgram Terminating...\n");
                    flag = false; // set flag to false to stop the loop
                    break;
                default:
                    // default message to handle choice other than 1-5
                    System.out.println("\nSelect only from 1-4.\n");
                    break;
            }
        }
    }

}