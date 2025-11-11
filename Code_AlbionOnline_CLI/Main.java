package Tugas.AlbionOnline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        Scanner input = new Scanner(System.in);

        weaponMenu menu = new weaponMenu(ui, input);
        menu.start();
    }
}
