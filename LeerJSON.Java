import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

class LeerJSON {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Leer el archivo JSON y convertirlo a un objeto Persona
        try (FileReader reader = new FileReader("persona.json")) {
            Persona persona = gson.fromJson(reader, Persona.class);
            
            // Imprimir los datos leídos
            System.out.println("Nombre: " + persona.nombre);
            System.out.println("Edad: " + persona.edad);
            System.out.println("Ciudad: " + persona.ciudad);
            System.out.println("Habilidades: " + Arrays.toString(persona.habilidades));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
