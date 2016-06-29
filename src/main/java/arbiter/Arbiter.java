package arbiter;


import java.util.*;


class Arbiter {
    private List<Set<Integer>> possibleWinningCombinations = new ArrayList<>();

    private Arbiter(List<Set<Integer>> possibleWinningCombinations) {
        this.possibleWinningCombinations = possibleWinningCombinations;
    }

    static Arbiter getArbiter() {
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

    boolean decide(Set<Integer> playerMoves) {
        for (Set s : possibleWinningCombinations) {
            if (playerMoves.containsAll(s))
                return true;
        }
        return false;
    }

    private static TreeSet<Integer> returnTreeSet(List<Integer> list) {
        return new TreeSet<>(list);
    }

}
