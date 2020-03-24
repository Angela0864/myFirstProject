package lesson18;

import lesson18.copyUtils.FileCopyFailedException;
import lesson18.copyUtils.FileCopyUtils;

public class CopyTask extends AbctractTask implements CopyFileTask{
    private FileCopyUtils copyUtils;
    private String from;
    private String to;

    public CopyTask(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(from, to);
        } catch (FileCopyFailedException e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }


    }
}
