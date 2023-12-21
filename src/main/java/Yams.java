import java.util.List;

public class Yams {

    public int game(List<Integer> spears) {
        for (int i = 0; i < spears.size(); i++) {
            int count = 0;
            for (Integer spear : spears) {
                if (spears.get(i).equals(spear)) {
                    count++;
                }
            }
            if (count == 3) {
                return 28;
            }
        }
        return 0;

    }

}