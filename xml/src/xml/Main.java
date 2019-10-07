package xml;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        XMLWriter x = new XMLWriter();
        x.init();
        Scanner input = new Scanner(System.in);

        if (!x.getFileXML().exists()) {
            System.out.println("File Non Esistente");
            x.newFile();
        } else {
            System.out.println("Il file è gia' esistente");
        }

        Persona p = new Persona();
        String check;
        int i=0;
        do {
            x.writeOpenTag("persona_" + i);
            p.newPersona();
            x.writeOnFile("nome", p.getNome());
            x.writeOnFile("cognome", p.getCognome());
            x.writeOnFile("telefonoCasa", p.getnTel());
            x.writeOnFile("telefonoLavoro", p.getnTelefLavoro());
            x.writeOnFile("Email", p.getEmail());
            x.writeCloseTag("persona_" + i);
            System.out.println("Vuoi Inserire un nuovo contatto?");
            check = input.nextLine();
            i++;
        } while (!check.equals("no"));
        x.closeFile();
    }

}
