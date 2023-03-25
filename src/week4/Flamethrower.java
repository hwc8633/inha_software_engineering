package week4;

public class Flamethrower implements Weapon{
    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("화염방사를 " + pokemon.getName() + "에게 발사합니다!");
    }
}
