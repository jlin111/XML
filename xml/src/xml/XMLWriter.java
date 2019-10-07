package xml;

import java.io.*;

public class XMLWriter {

    private File fileXML;
    private FileWriter fw;
    String path = "rubrica.xml";

    public XMLWriter() {

    }

    public void init() throws IOException {
        this.fileXML = new File(path);

        this.fw = new FileWriter(fileXML);
        fw.write("<?xml version='1.0'?>");
        fw.write("<rubrica>");
    }

    public void newFile() throws IOException {
        if (fileXML.exists()) {
            System.out.println("Il file " + path + " esiste");
        } else if (fileXML.createNewFile()) {
            System.out.println("Il file " + path + " è stato creato");

        } else {
            System.out.println("Il file " + path + " non può essere creato");
        }
    }

    public void closeFile() throws IOException {
        fw.write("</rubrica>");
        fw.close();
    }

    public void writeOnFile(String tag, String arg) {
        try {
            fw.write("<" + tag + ">" + arg + "</" + tag + ">");
            fw.flush();
        } catch (IOException e) {
        }
    }
    
    public void writeOpenTag(String tag) {
        try {
            fw.write("<" + tag + ">");
            fw.flush();
        } catch (IOException e) {
        }
    }
    
     public void writeCloseTag(String tag) {
        try {
            fw.write("</" + tag + ">");
            fw.flush();
        } catch (IOException e) {
        }
    }

    public File getFileXML() {
        return fileXML;
    }

    public void setFileXML(File fileXML) {
        this.fileXML = fileXML;
    }

    public FileWriter getFw() {
        return fw;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

}
