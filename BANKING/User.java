package BANKING;

import BANKING.account.Account;

import java.util.ArrayList;
import java.util.Arrays;


public class User {
    private String UserId;
    private String name;
    private String dateOfBirth;
    private String phone;
    private String address;
    private ArrayList<Account> accounts = new ArrayList<>();

    public User(String UserId, String name, String dateOfBirth, String phone, String address) {
        this.UserId = UserId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        this.UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

//    public void removeAccount(int cardId) {
//        for (int i = 0; i < accounts.size(); i++) {
//            if (accounts.equals(cardId)) {
//                accounts.remove(accounts);
//                break;
//            }
//        }
//    }
    public void removeAccount(int cardId) {
//        for(Account i: accounts){
//            if(cardId == 002)
//                accounts.remove(i);
//        }
        System.out.println(" Not completed");;
    }
public void display(){
    System.out.println("User ID: " + this.UserId);
    System.out.println("Name: " + this.name);
    System.out.println("Date of Birth: " + this.dateOfBirth);
    System.out.println("Phone: " + this.phone);
    System.out.println("Address"+ address);
}
    public void ShowCard() {
        accounts.stream().forEach(System.out::println);



    }
}

