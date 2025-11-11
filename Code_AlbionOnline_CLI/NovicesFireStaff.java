package Tugas.AlbionOnline;

public class NovicesFireStaff extends Staff {
    public NovicesFireStaff(){
        super("Novice's Fire Staff",
                "Staff api dasar untuk pemula",
                10,
                new NoviceFireSkill());
    }
}
