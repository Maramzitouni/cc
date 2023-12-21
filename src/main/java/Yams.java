import java.util.List;

public class Yams {

    public int game(List<Integer> rolls) {
        boolean hasThree = false;
        boolean hasTwo = false;

        for (int roll : rolls) {
            int count = countOccurrences(rolls, roll);
            if (count == 5) {
                return 50;
            } else if (count == 4) {
                return 35;
            } else if (count == 3) {
                hasThree = true;
            } else if (count == 2) {
                hasTwo = true;
            }
        }
        if (hasThree && hasTwo) {
            return 30;
        } else if (hasThree) {
            return 28;
        } else {
        return sumOfRolls(rolls);
        }
    }
    private int countOccurrences(List<Integer> rolls, int number) {
        int count = 0;
        for (int roll : rolls) {
            if (roll == number) {
                count++;
            }
        }
        return count;
    }

    private int sumOfRolls(List<Integer> rolls) {
        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }
        return sum;
    }


}