package utils;

import utils.MyFileHandler;

import java.io.FileNotFoundException;

public class TestMyFileHandlerText
{
	public static void main(String[] args)
	{

		try
		{
			MyFileHandler.writeToTextFile("Test.txt", "Hello");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}

		String[] strings = { "Just", "some", "more", "strings" };

		try
		{
			MyFileHandler.appendArrayToTextFile("Test.txt", strings);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		String[] result = null;
		try
		{
			result = MyFileHandler.readArrayFromTextFile("Test.txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}

		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}
