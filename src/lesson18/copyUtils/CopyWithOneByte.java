package lesson18.copyUtils;

import java.io.*;

// 20294 ms = 554MB

public class CopyWithOneByte implements FileCopyUtils {


    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File dest = new File(destination);
        if(dest.exists()){
            throw new FileAlreadyExistsException("Целевой файл цже существует!!!");
        }

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (IOException e) {
            throw new FileCopyFailedException(e.getMessage());
        }

    }
}
