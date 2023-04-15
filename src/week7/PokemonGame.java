package week7;

class Pokemon {
    public void attack() {
        System.out.println("공격!");
    }
}

class Trainer {
    private final Pokemon pokemon;

    public Trainer() {
        pokemon = new Pokemon();
    }

    public void battle() {
        pokemon.attack();
    }

    public void catchPokemon() {
        System.out.println("포켓몬 획득~");
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Trainer jiwoo = new Trainer();
        jiwoo.catchPokemon();
        jiwoo.battle();
    }
}
