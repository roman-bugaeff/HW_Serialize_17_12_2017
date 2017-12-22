package com.tel_ran;

import java.io.*;
import java.util.List;


public class ReadOfFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("resourses/users.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //while (true) {
            //int i = 0;
            try {
                List<User> list= (List<User>) ois.readObject();
                for(int i = 0; list.size()> 0;i++)
                System.out.println(list.get(i));
                //i++;
            } catch (ClassNotFoundException e) {
                //if (ois.available() == 0) break;
            }
        //}
        fis.close();
        ois.close();
    }
}

