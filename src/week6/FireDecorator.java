package week6;

public class FireDecorator implements PokemonDecorator {
    private Pokemon pokemon;

    public FireDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        System.out.println("화염 공격");
    }

    @Override
    public int getLevel() {
        return pokemon.getLevel();
    }

    @Override
    public int getHP() {
        return pokemon.getHP();
    }

    @Override
    public String getName() {
        return pokemon.getName();
    }
}
