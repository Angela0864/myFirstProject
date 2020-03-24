package lesson18;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FindTask task1 = new FindTask();
        FindTask task2 = new FindTask();
        FindTask task3 = new FindTask();
        FindTask task4 = new FindTask();
        FindTask task5 = new FindTask();

        task1.setPrintStream(System.out);
        task2.setPrintStream(System.out);
        task3.setPrintStream(System.out);
        task4.setPrintStream(System.out);
        task5.setPrintStream(System.out);

        try {
            task1.setDirectory("D://");
            task2.setDirectory("D://");
            task3.setDirectory("D://");
            task4.setDirectory("D://");
            task5.setDirectory("D://");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        task1.setFileNameSearchString("java");
        task2.setFileNameSearchString("png");
        task3.setFileNameSearchString("im");
        task4.setFileNameSearchString("24");
        task5.setFileNameSearchString("про");

        CopyTask task6 = new CopyTask("D:\\JavaLesson18\\JavaFrom\\1.jpg", "D:\\JavaLesson18\\JavaTo\\1.jpg");
        CopyTask task7 = new CopyTask("D:\\JavaLesson18\\JavaFrom\\2.jpg", "D:\\JavaLesson18\\JavaTo\\2.jpg");
        CopyTask task8 = new CopyTask("D:\\JavaLesson18\\JavaFrom\\3.jpg", "D:\\JavaLesson18\\JavaTo\\3.jpg");
        CopyTask task9 = new CopyTask("D:\\JavaLesson18\\JavaFrom\\4.jpg", "D:\\JavaLesson18\\JavaTo\\4.jpg");
        CopyTask task10 = new CopyTask("D:\\JavaLesson18\\JavaFrom\\5.jpg", "D:\\JavaLesson18\\JavaTo\\5.jpg");

        TasksStorageImpl storage = new TasksStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);
        storage.add(task7);
        storage.add(task8);
        storage.add(task9);
        storage.add(task10);
    }
}
