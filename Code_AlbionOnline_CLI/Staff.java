package Tugas.AlbionOnline;

public abstract class Staff {
    protected String name;
    protected String description;
    protected int baseDamage;
    protected Skill skill;

    public Staff(String name, String description, int baseDamage, Skill skill){
        this.name = name;
        this.description = description;
        this.baseDamage = baseDamage;
        this.skill = skill;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getBaseDamage(){
        return baseDamage;
    }

    public String getSkillInfo(){
        return skill.getSkillName() + " → " + skill.useSkill();
    }
}
