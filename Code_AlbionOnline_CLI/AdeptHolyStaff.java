package Tugas.AlbionOnline;

public class AdeptHolyStaff extends Staff {
    public AdeptHolyStaff(){
        super("Adept's Holy Staff",
                "Staff Suci dengan kemampuan penyembuhan",
                14,
                new AdeptHolySkill());
    }
}
