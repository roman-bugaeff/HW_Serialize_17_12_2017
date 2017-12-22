package com.tel_ran;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by rbuga on 12/18/2017.
 */
public class WriteToFile {
    public static void main (String[] args) throws IOException {

        serialize();
    }

    private static void serialize() throws IOException {
        File file = new File("resourses/users.bin");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos= new FileOutputStream(file, true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        User user = User.getFromKeyboard(br);
        ArrayList<User> list = new ArrayList<>();

        list.add(user);
        oos.writeObject(list);
    }
}
