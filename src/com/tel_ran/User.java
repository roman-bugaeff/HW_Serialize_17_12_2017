package com.tel_ran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by rbuga on 12/17/2017.
 */
public class User implements Serializable {
    String userName;
    String password;
    String firstName;
    String lastName;
    String email;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(String userName, String password, String firstName, String lastName, String email) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static User getFromKeyboard(BufferedReader br){
        String userName = null;
        String password = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String nInp = null;

        while(true){
            System.out.println("Input user name: ");
            try {
                nInp = br.readLine();
                if(!nInp.equals("") && !nInp.equalsIgnoreCase("exit")){
                    userName = nInp;
                    break;
                }else{
                    if(!nInp.equals(""))return null;
                    System.out.println("Empty name not allowed!");
                }
            } catch (IOException e) {}
        }

        while(true){
            System.out.println("Input password: ");
            try {
                nInp = br.readLine();
                if(!nInp.equals("") && !nInp.equalsIgnoreCase("exit")){
                    password = nInp;
                    break;
                }else{
                    if(!nInp.equals(""))return null;
                    System.out.println("Empty password not allowed!");
                }
            } catch (IOException e) {}
        }

        while(true){
            System.out.println("Input first name: ");
            try {
                nInp = br.readLine();
                if(!nInp.equals("") && !nInp.equalsIgnoreCase("exit")){
                    firstName = nInp;
                    break;
                }else{
                    if(!nInp.equals(""))return null;
                    System.out.println("Empty first name not allowed!");
                }
            } catch (IOException e) {}
        }

        while(true){
            System.out.println("Input last name: ");
            try {
                nInp = br.readLine();
                if(!nInp.equals("") && !nInp.equalsIgnoreCase("exit")){
                    lastName = nInp;
                    break;
                }else{
                    if(!nInp.equals(""))return null;
                    System.out.println("Empty last name not allowed!");
                }
            } catch (IOException e) {}
        }

        while(true){
            System.out.println("Input email: ");
            try {
                nInp = br.readLine();
                if(!nInp.equals("") && !nInp.equalsIgnoreCase("exit")){
                    email = nInp;
                    break;
                }else{
                    if(!nInp.equals(""))return null;
                    System.out.println("Empty email not allowed!");
                }
            } catch (IOException e) {}
        }

        return new User(userName,password,firstName,lastName, email);
    }




}

