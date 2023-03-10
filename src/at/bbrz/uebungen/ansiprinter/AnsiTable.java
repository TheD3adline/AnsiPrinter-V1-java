package at.bbrz.uebungen.ansiprinter;

public class AnsiTable {

    public void print() {

        System.out.println("\033[48;2;1;228;0m \033[0m");
        System.out.println("\033[48;5;2m \033[0m");

        for (int i = 1; i <257 ; i++) {
            System.out.print("\033[48;5;"+(i-1)+"m"+String.format("%5d",(i-1))+"\033[0m");
            if (i%16==0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
