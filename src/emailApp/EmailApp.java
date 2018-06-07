package emailApp;

public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email("Piotr","Maciak");

        em1.changePassword("myPassword123");
        em1.setAlternateEmail("p.maciak@mail.com");
        em1.setMailboxCapacity(1000);

        em1.getAlternateEmail();
        em1.getMailboxCapacity();
        em1.getPassword();

        System.out.println(em1.showInfo());



    }
}
