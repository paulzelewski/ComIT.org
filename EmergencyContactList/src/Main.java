import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int totalContacts = 3;
        Scanner input = new Scanner(System.in);
        Contacts contacts = new Contacts(totalContacts);

        for (int i = 0; i < totalContacts; i++) {
            System.out.print("First name: ");
            String firstName = input.nextLine();
            System.out.print("Last name: ");
            String lastName = input.nextLine();
            System.out.print("Blood group: ");
            String bloodGroup = input.nextLine();
            System.out.print("Emergency contact name: ");
            String emergencyContact = input.nextLine();
            System.out.print("Emergency contact phone number: ");
            String emergencyContactNumber = input.nextLine();
            System.out.print("Phone number: ");
            String cellNo = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Street name: ");
            String streetName = input.nextLine();
            System.out.print("Street number: ");
            int streetNumber = input.nextInt();
            input.nextLine();
            System.out.print("City: ");
            String city = input.nextLine();
            System.out.print("Province: ");
            String province = input.nextLine();
            System.out.print("Country: ");
            String country = input.nextLine();

            contacts.setContactInfo(i,new ContactInfo(
                    new PersonalInfo(firstName, lastName, bloodGroup, emergencyContact, emergencyContactNumber),
                    cellNo, email,
                    new Address(streetName, city, province, country, streetNumber))
            );
        }
        input.close();
        System.out.println(String.format("| %-10s | %-12s | %-10s | %-22s | %-24s | %-12s | %-40s | %-15s | %-9s | %-12s | %-12s | %-12s",
                "First Name","Last name","Blood type","Emergency Contact","Emergency Contact Number","Phone Number",
                "Email","Street Name","Street No","City","Province","Country"));
        for (int i = 0; i < totalContacts; i++) {
            System.out.println(contacts.getContactInfo(i).toString());
        }
    }
}
