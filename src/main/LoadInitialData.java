package main;

import model.User;
import model.UserList;
import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadInitialData
{
    public static void main(String[] args)
    {
        UserList users = new UserList();
        String[] UserArray = null;

        try
        {
            UserArray = MyFileHandler.readArrayFromTextFile("users.txt");

            for(int i = 0; i<UserArray.length; i++)
            {
                String temp = UserArray[i];
                String[] tempArr = temp.split(",");
                String firstName = tempArr[0];
                String lastName = tempArr[1];
                long phone = Long.parseLong(tempArr[2]);
                boolean isMember = Boolean.parseBoolean(tempArr[3]);

                users.addUser(new User(firstName, lastName, phone, isMember));
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File was not found, or could not be opened");
        }

        try
        {
            MyFileHandler.writeToBinaryFile("users.bin", users);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening file ");
        }
        catch (IOException e)
        {
            System.out.println("IO Error writing to file ");
        }

        System.out.println("Done");
    }

}
