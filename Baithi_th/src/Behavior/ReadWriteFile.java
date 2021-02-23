package Behavior;

import Entities.Phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "Name,Phone Number,Address,Email,Facebook,Nickname";

    public static void writeToFileCsv(List<Phonebook> phonebooks, String pathFile) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(pathFile);
            fileWriter.append(FILE_HEADER.toString());
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Phonebook c : phonebooks) {
                fileWriter.append(String.valueOf(c.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(c.getName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(c.getNumberPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getFaceBook());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Done!!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static void readFromFileCsv(String pathFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                if (cols[0].equals("Name")) {
                    System.out.println("phoneBook : ");
                } else System.out.println(" Id " + cols[0] + "Name: " + cols[1] + ", phone number: " + cols[2] +
                        ", address: " + cols[3] + ", email: " + cols[4] + ", facebook: " +
                        cols[5] + ", nickname: " + cols[6]);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static List<Phonebook> readCSV(String pathFile){
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String line;
            ArrayList<Phonebook> phonebooks = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                if (cols[0].equals("Name")){}else {
                    Phonebook c = new Phonebook();
                    c.setId(Integer.parseInt(cols[0]));
                    c.setName(cols[1]);
                    c.setNumberPhone(cols[2]);
                    c.setAddress(cols[3]);
                    c.setEmail(cols[4]);
                    c.setFaceBook(cols[5]);
                    c.setName(cols[6]);
                    phonebooks.add(c);
                }
            }
            return phonebooks;
        }catch (IOException io){
            io.printStackTrace();
        }
        return null;
    }

    //read and write object
    public static void writeObjectToFile(Object serObj, String filepath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readFromFile(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            objectIn.close();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
