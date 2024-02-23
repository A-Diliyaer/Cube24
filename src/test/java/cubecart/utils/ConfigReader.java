package cubecart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readFromConfig(String fileName,String key){
        Properties properties=new Properties();
        //open the file in reading mode
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value= properties.getProperty(key);
        return value;
    }

    public static String getProperty(String key){
        return getProperty(key);
    }
}
