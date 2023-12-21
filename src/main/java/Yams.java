import java.util.List;

public class Yams {

    public int game(List<Integer> spears) {
        boolean hasThree = false;
        boolean hasTwo = false;

        for (int i = 0; i < spears.size(); i++) {
            int count = 0;
            for (Integer spear : spears) {
                if (spears.get(i).equals(spear)) {
                    count++;
                }
            }
            if(count == 5){
                return 50;
            }
            if (count == 4) {
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
        }
        return 0;
    }

}