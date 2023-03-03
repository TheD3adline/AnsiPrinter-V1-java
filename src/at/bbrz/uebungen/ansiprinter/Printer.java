package at.bbrz.uebungen.ansiprinter;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    private final String ansiReset = "\u001B[0m";
    private final List<String> colors = new ArrayList<>();

    public Printer() {
        for(int i = 0; i < 8; i++) {
            colors.add("\u001b[4" + i + "m");
        }
        for(int i = 0; i < 8; i++) {
            colors.add("\u001b[4" + i + ";1m");
        }
    }

    public void Print(AsciiArt data) {
        int counter = data.getData().length() / 2;
        for(int i = 0; i < data.getHeight(); i++) {
            for(int j = 0; j < data.getWidth(); j++) {
                System.out.print(colors.get(Integer.parseInt(data.getData().substring(counter, (counter + 2)), 16))
                                + ansiReset);
            }
        }
    }
}