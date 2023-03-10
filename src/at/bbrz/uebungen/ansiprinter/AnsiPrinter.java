package at.bbrz.uebungen.ansiprinter;

import java.util.ArrayList;
import java.util.List;

public class AnsiPrinter {

    private final String ansiReset = "\u001B[0m";
    private final List<String> colors = new ArrayList<>();

    public AnsiPrinter(AnsiArt imgData) {
        for (int i = 0; i < 16 ; i++) {
            colors.add("\033[48;5;" + imgData.getColorData()[i] + "m   \033[0m");
        }
        print(imgData);
    }

    public void print(AnsiArt img) {
        int counter = 0;
        for(int i = 0; i < img.getImgHeight(); i++) {
            for(int j = 0; j < img.getImgWidth(); j++) {
                System.out.print(colors.get(Integer.parseInt(img.getImgData().substring(counter, (counter + 1)), 16)));
                counter += 1;
            }
            System.out.println();
        }
        System.out.println(ansiReset);
    }
}