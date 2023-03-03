package at.bbrz.uebungen.ansiprinter;

public class AsciiArt {

    private final int height;
    private final int width;
    private final String data;

    public AsciiArt(String data) {
        this.height = Integer.parseInt(data.substring(0, 2));
        this.width = Integer.parseInt(data.substring(2, 4));
        this.data = data.substring(4);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getData() {
        return data;
    }
}