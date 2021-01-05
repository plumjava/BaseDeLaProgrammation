
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thbogusz
 */
public class RenameOneFile {

    public void renameFile(String pathFileOrigine, String pattern, String prefixe) {

        File file = new File(pathFileOrigine);
        String filename = file.getName();

        String newfilename = file.getName();
        newfilename = newfilename.replace(pattern, prefixe + pattern);
        File newfile = new File(file.getPath().replace(filename, newfilename));

        file.renameTo(newfile);

    }
}

public void renameAllFile(String pathDir, String prefixe) {
      //---- A FAIRE SI BESOIN
        File dir = new File(pathDir);


        File filesT[] = dir.listFiles();
        for (int j = 0; j < filesT.length; j++) {

            if (filesT[j].isDirectory()) {

                File files[] = filesT[j].listFiles();


                for (int i = 0; i < files.length; i++) {
                    String filename = files[i].getName();

                    String newfilename = files[i].getName();
                    newfilename = newfilename.replace("  ", " ");
                    newfilename = newfilename.replace(' ', '.');
                    newfilename = newfilename.replace("jpg", "png");

                    File newfile = new File(files[i].getPath().replace(filename, newfilename));

                    files[i].renameTo(newfile);
                }

            }
        }
    }
     
    
}
