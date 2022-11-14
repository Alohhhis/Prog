import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
/*
//https://pokemondb.net/pokedex/suicune
https://pokemondb.net/pokedex/fomantis
https://pokemondb.net/pokedex/lurantis
https://pokemondb.net/pokedex/bounsweet
https://pokemondb.net/pokedex/steenee
https://pokemondb.net/pokedex/tsareena
 */
public class
Prog {
    public static void main(String[] args) {

        Battle b = new Battle();
        Fomantis fomantis = new Fomantis("Витя", 1);
        Suicune suicune = new Suicune("Вова", 1);
        Bounsweet bounsweet = new Bounsweet("Ваня", 1);
        Lurantis lurantis = new Lurantis("Валя", 1);
        Steenee steenee = new Steenee("Вася", 1);
        Tsareena tsareena = new Tsareena("Веня", 1);

        b.addAlly(fomantis);
        b.addAlly(suicune);
        b.addAlly(bounsweet);
        b.addFoe(lurantis);
        b.addFoe(steenee);
        b.addFoe(tsareena);
        b.go();
    }


}