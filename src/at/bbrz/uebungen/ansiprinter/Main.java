package at.bbrz.uebungen.ansiprinter;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        AsciiArt art = new AsciiArt("0306112211134431111111");

        printer.Print(art);
    }
}