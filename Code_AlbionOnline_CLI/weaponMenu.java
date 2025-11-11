package Tugas.AlbionOnline;

import java.util.Scanner;

public class weaponMenu {
    private UI ui;
    private Scanner input;


    private Staff staff1 = new NovicesFireStaff();
    private Staff staff2 = new AdeptHolyStaff();
    private Staff staff3 = new ExpertGreatStaff();

    public weaponMenu(UI ui, Scanner input){
        this.ui = ui;
        this.input = input;
    }

    public void start(){
        while(true){
            ui.showPage(
                    "1. Masukkan Username\n" +
                            "2. Lihat Deskripsi Senjata\n" +
                            "3. Pesan Feedback\n" +
                            "4. Keluar"
            );

            System.out.print(">> ");
            String choice = input.nextLine();

            switch(choice){
                case "1": inputUsername(); break;
                case "2": selectWeaponDescription(); break;
                case "3": feedbackMessage(); break;
                case "4": return;
                default: break;
            }
        }
    }

    private void inputUsername(){
        ui.showPage("Masukkan username:");
        System.out.print(">> ");
        String username = input.nextLine();
        ui.showPage("Halo " + username + "! (ENTER untuk kembali)");
        input.nextLine();
    }

    private void selectWeaponDescription(){
        ui.showPage(
                "Pilih Senjata:\n\n" +
                        "1. " + staff1.getName() + "\n" +
                        "2. " + staff2.getName() + "\n" +
                        "3. " + staff3.getName() + "\n"
        );

        System.out.print(">> ");
        String choice = input.nextLine();

        switch(choice){
            case "1": showStaffDetail(staff1); break;
            case "2": showStaffDetail(staff2); break;
            case "3": showStaffDetail(staff3); break;
            default:
                ui.showPage("Input tidak valid.");
                input.nextLine();
        }
    }

    private void showStaffDetail(Staff s){
        ui.showPage(
                "Nama : " + s.getName() +
                        "\nDeskripsi : " + s.getDescription() +
                        "\nBase Damage : " + s.getBaseDamage() +
                        "\nSkill : " + s.getSkillInfo() +
                        "\n\n(ENTER untuk kembali)"
        );
        input.nextLine();
    }

    private void feedbackMessage(){
        ui.showPage("Tulis feedback:");
        System.out.print(">> ");
        String text = input.nextLine();
        ui.showPage("Feedback diterima:\n\n" + text + "\n\n(ENTER untuk kembali)");
        input.nextLine();
    }
}
