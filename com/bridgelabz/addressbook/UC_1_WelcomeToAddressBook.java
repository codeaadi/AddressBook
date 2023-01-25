package com.bridgelabz.addressbook;

public class UC_1_WelcomeToAddressBook {
    public class AddressBookMain  {

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program");
            AddressBook addressBook = new AddressBook();
            addressBook.addContact();
        }
    }
}
