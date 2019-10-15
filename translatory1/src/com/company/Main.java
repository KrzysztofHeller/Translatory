package com.company;
import javax.swing.JFileChooser;
import java.io.File;

public class Main {

    public static void main(String[] args) {

    GetFile getFile =  new GetFile();
    String path = getFile.patchToFile();

    GetString getString = new GetString();
    String content = getString.fileToString(path);
    CheckFileType type = new CheckFileType();
    System.out.println(content);
    type.showType(content);
    }
}
