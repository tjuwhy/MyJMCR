package top.stanwang.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){
    }

    public static Properties getProperties(String dbName){
        String filename = dbName + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: "+ filename + " is not found.");
        }
        return prop;
    }
}
