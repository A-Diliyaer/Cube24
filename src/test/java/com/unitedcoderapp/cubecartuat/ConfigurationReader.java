package com.unitedcoderapp.cubecartuat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author : alfir
 * @created : 2/21/2024,2:07 PM
 **/
public class ConfigurationReader {
    public static String readFromConfig(String fileName,String key){
        Properties properties=new Properties();
        FileInputStream inputStream=null;
        try {
            inputStream=new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value=properties.getProperty(key);
        return value;
    }
}

