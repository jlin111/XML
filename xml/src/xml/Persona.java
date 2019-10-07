package xml;

import java.util.Scanner;

public class Persona {

    String nome;
    String cognome;
    String nTel;
    String nTelefLavoro;
    String email;
    
    public Persona(){ 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }
    
    public String getnTelefLavoro() {
        return nTel;
    }

    public void setnTelefLavoro(String nTelefLavoro) {
        this.nTel = nTel;
    }
    public String getEmail() {
        return nTel;
    }

    public void setEmail(String email) {
        this.nTel = nTel;
    }

    public Persona(String nome, String cognome, String nTel, String nTelefLavoro, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.nTel = nTel;
        this.email = email;
        this.nTelefLavoro = nTelefLavoro;
        
    }

    public void newPersona() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire i Dati del Nuovo Contatto\nNome: ");
        this.nome = input.nextLine();
        System.out.println("Cognome: ");
        this.cognome = input.nextLine();
        System.out.println("Numero di Telefono: ");
        this.nTel = input.nextLine();
        System.out.println("Numero di Telefono lavoro: ");
        this.nTelefLavoro = input.nextLine();
        System.out.println("Email: ");
        this.email = input.nextLine();
    }

}
