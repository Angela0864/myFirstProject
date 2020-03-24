package lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindTask extends AbctractTask implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream out;

    public FindTask() {

    }

    public FindTask(String directory, String searchString, PrintStream out) throws FileNotFoundException{
        this.setDirectory(directory);
        this.setFileNameSearchString(searchString);
        this.setPrintStream(out);
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if(directory == null) {
            throw new NullPointerException("directory is null");
        }

        File dir = new File(directory);
        if(!dir.exists()){
            throw new FileNotFoundException("По указанному пути папка не найдена!!!");
        }
        if(dir.isFile()){
            throw new FileNotFoundException("По указанному пути файл, а не папка!!!");
        }


        this.directory = directory;

    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null){
            throw new IllegalArgumentException("Не задано слово поиска!!!");
        }


        this.searchString = searchString;

    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {

            File dir = new File(directory);
            File[] result = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().contains(searchString)) {
                        return true;
                    }
                    return false;
                }
            });




            for (File f : result) {
                out.println(f.getAbsolutePath());
            }
        } catch (Exception e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }


    }
}
