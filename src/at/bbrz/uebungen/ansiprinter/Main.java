package at.bbrz.uebungen.ansiprinter;

public class Main {
    public static void main(String[] args) {

        AnsiTable table = new AnsiTable();

        AnsiArt art1 = new AnsiArt("0306000001002003004005006007008009010011012013014015112211134431111111");

        AnsiArt art2 = new AnsiArt("08080000112500000000000000000000000000000000000000000011110001111110111121111111100011110000111111000111111000111100");

        AnsiArt art3 = new AnsiArt("191B239040091231094224000000000000000000000000000000666666660000006666666600666666666601111110666666000066666666011111111066660066006666660111111111106600666600666660222222222206600666600666600222222222200660066006666011111111111111066660066666600454552252500666660666666660454523323206666660666666660455523323206666660666666666055052252506666600666666666605500555066666020666666000010555550000000202066660111111000001111112202066601111111112211111112202066602200011121120000000000666602220011111210666666660666602220011112110666666660666660006011111110666666660666666666011112110666666660666666660111101111066666660666666002111060111200666660666600222210666012222006660666022222220666022222220606066000000000666000000000660666");


        table.print();

        art1.print();

        art2.print();

        art3.print();
    }
}