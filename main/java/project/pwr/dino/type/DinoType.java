package project.pwr.dino.type;

public class DinoType {
    public String id;
    public int hp = 100;
    public int attack = 100;
    public int alive = 1;

    public DinoType(String id, Integer hp, Integer attack){
        this.id = id;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public String toString()
    {
        return id;
    }


}
