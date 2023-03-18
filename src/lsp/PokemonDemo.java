package lsp;

class Pokemon {
    public void attack() {
        System.out.println("공격 실패!");
    }
}

class FirePokemon extends Pokemon {
    @Override
    public void attack() {
        System.out.println("불 속성 공격 성공");
    }
}

class WaterPokemon extends Pokemon {
    // 미구현
}

class ElectricPokemon extends Pokemon {
    @Override
    public void attack() {
        throw new UnsupportedOperationException("전기 공격이 아직 완성되지 않았습니다");
    }
}

class Trainer {
    public void attackPokemon(Pokemon pokemon) {
        System.out.println();
    }
}

public class PokemonDemo {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();

    }
}
