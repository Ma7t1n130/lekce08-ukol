package cz.martin.lekce08ukol;

import java.nio.file.*;

public class Utils {

    private static String loadFromFile(String fileName) throws Exception {
        try{
            return Files.readString(Paths.get(fileName));
        }catch(Exception e){
            throw new Exception("Chyba pri cteni souboru.");
        }
    }

    public static String readFromFile(String fileCode){
        String result;
        String fileName;
        try{
            fileName=".\\resources\\"+fileCode+".txt";
            result=Utils.loadFromFile(fileName);
        }catch(Exception e){
            result=e.getMessage();
        }
        return result;
    }
}
