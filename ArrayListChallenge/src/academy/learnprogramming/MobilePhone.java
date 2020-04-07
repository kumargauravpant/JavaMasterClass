package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    public void getContacts() {
        System.out.println("You currently have "+ contactList.size() +" contacts in your contact list.");
        for (int i =0; i<contactList.size(); i++) {
            System.out.print(i+1 + ". ");
            System.out.println("\tName: " + contactList.get(i).getName());
            System.out.println("\tPhone Number: " + contactList.get(i).getPhoneNumber());
        }
    }

    public void addContacts(String name, String number) {
        Contacts contacts = new Contacts(name,number);
        contactList.add(contacts);
        System.out.println("Contact " + name + " is added successfully.");
    }

    private int findContact(String name) {
        int stringIndex = -1;
        for (int i=0; i< contactList.size(); i++) {
            if(contactList.get(i).getName().equalsIgnoreCase(name)){
                stringIndex = i;
            }
        }
        return stringIndex;
    }

    public void searchContacts(String name) {
        int contextIndex = findContact(name);
        if (contextIndex >=0) {
            System.out.println("Contact available in the list.");
            System.out.println("\tName: " + contactList.get(contextIndex).getName());
            System.out.println("\tPhone Number: " + contactList.get(contextIndex).getPhoneNumber());
        } else {
            System.out.println("Contact " + name + " is not available in the list.");
        }
    }

    public void modifyContact(String existingName, String newName, String newNumber) {
        int contextIndex = findContact(existingName);
        if (contextIndex >=0) {
            Contacts contacts = new Contacts(newName, newNumber);
            contactList.set(contextIndex, contacts);
            System.out.println("contact " + existingName + " is modified successfully.");
        } else {
            System.out.println("Contact " + existingName +" is not available in the list.");
        }
    }

    public void removeContact(String name) {
        int contextIndex = findContact(name);
        if (contextIndex >=0) {
            contactList.remove(contextIndex);
            System.out.println("Contact " + name + " is deleted successfully.");
        } else {
            System.out.println("Contact " + name +" is not available in the list.");
        }
    }
}
