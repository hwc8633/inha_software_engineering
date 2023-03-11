package ocp;

public abstract class Pokemon {
    private String name;
    protected int level;
    protected int hp;

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 추상 메소드
    public abstract void attack();

    public abstract void evolve();
}
