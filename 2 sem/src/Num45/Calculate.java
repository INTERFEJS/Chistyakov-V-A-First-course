package Num45;

import java.util.ArrayList;
import java.util.HashMap;
public class Calculate {

    public static int userDit;
    ArrayList<String> romanNumerals = new ArrayList<>();
    HashMap<Integer, String> map = new HashMap<>();

    public void calculating(int userYear) {
        userDit = userYear;

        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(5000, "L-100");
        map.put(10000, "C-100");

        checkFrom5000To10000();
        checkFrom1000To5000();
        checkFrom100To1000();
        checkFrom50To100();
        checkFrom10To50();
        checkFrom1To10();
    }

    public void checkFrom5000To10000() {
        if (5000 <= userDit && userDit <= 10000) {
            if (userDit < 9000) {
                int repeat = (userDit - 5000) / 1000;
                romanNumerals.add(map.get(5000));
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(1000));
                }
                userDit -= 5000 + repeat * 1000;
            } else {
                if (userDit == 10000) {
                    romanNumerals.add(map.get(1000));
                    userDit -= 10000;
                } else {
                    romanNumerals.add(map.get(1000));
                    romanNumerals.add((map.get(10000)));
                    userDit -= 9000;
                }
            }
        }
    }

    public void checkFrom1000To5000() {
        if (1000 < userDit && userDit < 5000) {
            if (userDit < 4000) {
                int repeat = (userDit - 1000) / 1000;
                romanNumerals.add(map.get(1000));
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(1000));
                }
                userDit -= 1000 + repeat * 1000;
            } else {
                romanNumerals.add(map.get(1000));
                romanNumerals.add(map.get(5000));
                userDit -= 4000;
            }
        }
    }

    public void checkFrom100To1000() {
        if (100 < userDit && userDit <= 1000) {
            if (userDit < 400) {
                int repeat = (userDit - 100) / 100;
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(100));
                }
                userDit -= 100 + repeat * 100;
            } else if (userDit > 400 && userDit < 500) {
                romanNumerals.add(map.get(100));
                romanNumerals.add(map.get(500));
                userDit -= 400;
            } else if (500 <= userDit && userDit < 900) {
                int repeat = (userDit - 500) / 100;
                romanNumerals.add(map.get(500));
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(100));
                }
                userDit -= 500 + repeat * 100;
            } else {
                if (userDit == 1000) {
                    romanNumerals.add(map.get(1000));
                    userDit -= 1000;
                } else {
                    romanNumerals.add(map.get(100));
                    romanNumerals.add(map.get(1000));
                    userDit -= 900;
                }
            }
        }
    }

    public void checkFrom50To100() {
        if (50 <= userDit && userDit < 100) {
            if (userDit < 90) {
                int repeat = (userDit - 1) / 10;
                romanNumerals.add(map.get(50));
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(10));
                }
                userDit -= 1 + repeat * 10;
            } else {
                if (userDit == 100) {
                    romanNumerals.add(map.get(100));
                    userDit -= 100;
                } else {
                    romanNumerals.add(map.get(10));
                    romanNumerals.add(map.get(100));
                    userDit -= 90;
                }
            }
        }
    }


    public void checkFrom10To50() {
        if (10 < userDit && userDit <= 50) {
            if (userDit <= 40) {
                int repeat = (userDit - 10) / 10;
                romanNumerals.add(map.get(10));
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(10));
                }
                userDit -= 10 + repeat * 10;
            } else {
                if (userDit == 50) {
                    romanNumerals.add(map.get(50));
                    userDit -= 50;
                } else {
                    romanNumerals.add(map.get(10));
                    romanNumerals.add(map.get(50));
                    userDit -= 40;
                }
            }
        }
    }

    public void checkFrom1To10() {
        if (1 <= userDit && userDit <= 10) {
            if (userDit < 4) {
                if (userDit == 1) {
                    romanNumerals.add(map.get(1));
                    userDit -= 1;
                }
                int repeat = userDit;
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(1));
                }
                userDit -= repeat;
            } else if (userDit <= 5) {
                if (userDit == 5) {
                    romanNumerals.add(map.get(5));
                    userDit -= 5;
                }else {
                    romanNumerals.add(map.get(1));
                    romanNumerals.add(map.get(5));
                    userDit -= 4;
                }
            } else if (userDit > 5 && userDit < 9)  {
                int repeat = userDit - 5;
                romanNumerals.add(map.get(5));
                for (int i = 0; i < repeat; i++) {
                    romanNumerals.add(map.get(1));
                }
                userDit -= 5 + repeat;
            }
            else {
                if (userDit == 10) {
                    romanNumerals.add(map.get(10));
                    userDit -= 10;
                } else {
                    romanNumerals.add(map.get(1));
                    romanNumerals.add(map.get(10));
                    userDit -= 9;
                }
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String romanNumeral : romanNumerals) {
            result.append(romanNumeral);
        }
        return result.toString();
    }
}
