package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetString {

    public String fileToString(String path){
        return readAllBytesJava7(path);
    }

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }
}
