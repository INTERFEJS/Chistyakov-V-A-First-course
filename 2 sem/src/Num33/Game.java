package Num33;

import static java.lang.Math.sqrt;

public class Game {
    public int countOfSticks;
    public int Sasha = 0;
    public int Tanya = 0;

    public int game(int countOfSticks) {
        while (countOfSticks != 1) {
            if (countOfSticks % 2 == 0) {
                Tanya++;
                countOfSticks--;
                if (countOfSticks == 1) {
                    break;
                } else {
                    Sasha++;
                    countOfSticks--;
                    //game(countOfSticks);
                }
            } else {
                Tanya++;
                countOfSticks--;
                if (countOfSticks % 2 == 0) {
                    Sasha += countOfSticks / 2;
                    countOfSticks /= 2;
                    if (countOfSticks == 1) {
                        break;
                    }
                } else {
                    game(countOfSticks);
                }
            }
        }
        return Tanya;
    }

    boolean IsSimple(int ANum) {
        if (ANum < 2)
            return false;
        double s = sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }
}
