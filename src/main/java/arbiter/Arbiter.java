package arbiter;

import player.Player;

import java.util.*;

public class Arbiter {
    private List<Set<Integer>> possibleWinningCombinations = new ArrayList<>();

    private Arbiter(List<Set<Integer>> possibleWinningCombinations) {
        this.possibleWinningCombinations = possibleWinningCombinations;
    }

    public static Arbiter getArbiter() {
        List<Set<Integer>> possibleWinningCombinations = new ArrayList<>();
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(1, 2, 3)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(4, 5, 6)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(7, 8, 9)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(1, 5, 9)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(3, 5, 7)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(1, 4, 7)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(2, 5, 8)));
        possibleWinningCombinations.add(returnTreeSet(Arrays.asList(3, 6, 9)));
        return new Arbiter(possibleWinningCombinations);
    }

     boolean compereToPossibleConditions(Set<Integer> playerMoves) {
        if (playerMoves.size() < 3)
            return false;
        for (Set s : possibleWinningCombinations) {
            if (playerMoves.containsAll(s))
                return true;
        }
        return false;
    }

    public boolean decide(Player player){
        if(compereToPossibleConditions(player.returnListOfMoves())) {
            System.out.println("Winner is" + player.returnListOfMoves());
            return true;
        }
        if(player.returnListOfMoves().size() == 5) {
            System.out.println("draw");
            return true;
        }
        return false;
    }


    private static TreeSet<Integer> returnTreeSet(List<Integer> list) {
        return new TreeSet<>(list);
    }
}
