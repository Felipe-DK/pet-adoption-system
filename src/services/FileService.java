package services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    public void initializeSystem() {

        try {

            File folder = new File("src/data");

            folder.mkdirs();

            File file = new File("src/data/formulario.txt");

            if(file.createNewFile()){

                FileWriter writer = new FileWriter(file);

                writer.write("1 - What is the pet's full name?\n");
                writer.write("2 - What is the pet type (Dog/Cat)?\n");
                writer.write("3 - What is the animal's sex?\n");
                writer.write("4 - What address and neighborhood was the pet found in?\n");
                writer.write("5 - What is the pet's approximate age?\n");
                writer.write("6 - What is the pet's approximate weight?\n");
                writer.write("7 - What is the pet's breed?\n");

                writer.close();

                System.out.println("Form created!");

            }

        } catch (IOException e){

            e.printStackTrace();

        }
    }
}