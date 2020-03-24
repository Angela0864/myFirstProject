package lesson18.copyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

// 12879ms = 554MB

public class CopyFilesUsingJava7Files implements FileCopyUtils  {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File scr = new File(source);
        File dest = new File(destination);

        if(dest.exists()){
            throw new FileAlreadyExistsException("Целевой файл уже существует!!!");
        }
        try {
            Files.copy(scr.toPath(), dest.toPath());
        } catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
