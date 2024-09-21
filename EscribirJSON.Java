import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class Persona {
    String nombre;
    int edad;
    String ciudad;
    String[] habilidades;

    public Persona(String nombre, int edad, String ciudad, String[] habilidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.habilidades = habilidades;
    }
}

public class EscribirJSON {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30, "Madrid", new String[]{"Python", "Django", "JavaScript"});

        // Crear un objeto Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Escribir el objeto Persona en un archivo JSON
        try (FileWriter writer = new FileWriter("persona.json")) {
            gson.toJson(persona, writer);
            System.out.println("Datos escritos en 'persona.json'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
