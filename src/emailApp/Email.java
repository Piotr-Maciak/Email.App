package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "pmcompany.com";

    // Constructor to receive the first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department - return the department
        this.department = setDepartment();

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate e-mail
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." +companySuffix;
        System.out.println("Your e-mail is: " + email);

    }


    // Ask for the department
    private String setDepartment(){
        System.out.print("New worker: " + firstName + ". Enter the department code:\n1. for Sales\n2. for Development\n3. for Accounting\n0. for none");
        Scanner in = new Scanner(System.in);

        int departmentChoice = in.nextInt();
        if(departmentChoice == 1) {return "sales";}
        else if(departmentChoice == 2) {return "development";}
        else if (departmentChoice == 3) {return "accounting";}
        else {return "";}


    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrtstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity = mailboxCapacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;

    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfo(){
        return "Employee name: " + firstName + " " + lastName +
                "\nCompany e-mail: " + email +
                "\nMailbox capacity: " + mailboxCapacity + "MB";


    }
}
