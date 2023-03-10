package at.bbrz.uebungen.ansiprinter;

public class AnsiArt {

    private final int imgHeight;
    private final int imgWidth;
    private final String imgData;
    private final String[] colorData;

    public AnsiArt(String imgData) {
        this.imgHeight = Integer.parseInt(imgData.substring(0, 2), 16);
        this.imgWidth = Integer.parseInt(imgData.substring(2, 4), 16);
        this.imgData = imgData.substring(52);
        this.colorData = new String[16];
        String color = imgData.substring(4, 52);
        int indexCounter = 0;
        for(int i = 0; i < 16; i++) {
            this.colorData[i] = color.substring(indexCounter, indexCounter + 3);
            indexCounter += 3;
        }
    }

    public void print() {
        new AnsiPrinter(this);
    }

    public int getImgHeight() {
        return imgHeight;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public String getImgData() {
        return imgData;
    }

    public String[] getColorData() {
        return colorData;
    }
}