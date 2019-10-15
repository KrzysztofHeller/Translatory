package com.company;

import java.awt.*;
import java.io.File;
import javax.swing.JFileChooser;


class GetFile extends Component {
    String patchToFile(){
        try{
            String path = "";
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                path = selectedFile.getAbsolutePath();
                System.out.println("Selected file: " + path);
            }
            return path;
        }catch (Exception e){
            return null;
        }

    }
}
