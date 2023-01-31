package project252;

import java.io.File;

public class Singleton {

    private static Singleton instance = null;
    private static File F1 = new File("info.txt");

    private Singleton() {
    }
    private Singleton(File F1) {
        this.F1 = F1;
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(F1);
        }
        return instance;
    }
    public static Singleton getInstance(File F1) {
        if (instance == null) {
            instance = new Singleton(F1);
        }
        return instance;
    }
   public File getFile() {
        return F1;
    }
}
