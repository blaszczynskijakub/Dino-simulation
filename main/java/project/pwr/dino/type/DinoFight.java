package project.pwr.dino.type;

public class DinoFight {
    public DinoType predator;
    public DinoType omnivorous;
    public DinoType herbivorous;

    public DinoFight(DinoType predator, DinoType omnivorous, DinoType herbivorous) {
        this.predator = predator;
        this.omnivorous = omnivorous;
        this.herbivorous = herbivorous;
    }

    public void hpChange()
    {
        this.predator.hp = predator.hp - omnivorous.attack - herbivorous.attack;
        this.omnivorous.hp = omnivorous.hp - predator.attack - herbivorous.attack;
        this.herbivorous.hp = herbivorous.hp - omnivorous.attack - predator.attack;
    }

    public void hpTimeChange()
    {
        this.predator.hp = predator.hp - 3;
        this.omnivorous.hp = omnivorous.hp - 1;
        this.herbivorous.hp = herbivorous.hp - 2;

    }

    public void stateChange()
    {
        if (herbivorous.hp <= 0)
            this.herbivorous.alive = 0;
        if (omnivorous.hp <= 0)
            this.omnivorous.alive = 0;
        if (predator.hp <= 0)
            this.predator.alive = 0;
    }

    public void result()
    {
        hpChange();
        stateChange();
    }

    public void timeResult()
    {
        hpTimeChange();
        stateChange();
    }
}
