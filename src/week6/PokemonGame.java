package week6;

public class PokemonGame {
    public static void main(String[] args) {
        FireDecorator fd1 = new FireDecorator(new BasicPokemon("초염몽", 30, 300));
        ElectricDecorator ed1 = new ElectricDecorator(new BasicPokemon("썬더", 40, 400));

        fd1.attack();
        ed1.attack();
    }
}
