package controller.Pet;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import model.Pet;


public class petJson {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Gson gson = new Gson();

        Pet pet = createStaffObject();

        // Java objects to String
        // String json = gson.toJson(staff);

        // Java objects to File
        try (FileWriter writer = new FileWriter("C:\\listaPetJson\\pet.json")) {
            gson.toJson(pet, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Pet createStaffObject() throws SQLException, ClassNotFoundException {
        
        Pet pet = new Pet();
        
        pet.getIdPet();
        pet.getNomePet();
        pet.getRacaPet();
        pet.getIdadePet();
        pet.getEspeciePet();
        pet.getCoresPet();
        pet.getSexoPet();
        pet.getPortePet();
        pet.getObservacoes();
        
        return pet;
    }

}
