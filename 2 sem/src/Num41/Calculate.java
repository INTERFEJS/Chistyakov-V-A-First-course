package Num41;

import java.util.ArrayList;
public class Calculate {

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> time = new ArrayList<>();

    public static int userSec;

    public void Calculating(int userDit) {
        userSec = userDit;
        years();
        months();
        days();
        hours();
        min();
        sec();
    }

    private void years() {
        if (userSec >= 31536000) {
            int year = userSec / 31536000;
            list.add(year);
            time.add("год");
            userSec = userSec - year * 31536000;
        }
    }

    private void months() {
        if (262800 <= userSec && userSec <= 31536000) {
            int months = userSec / 262800;
            list.add(months);
            time.add("месяцев");
            userSec = userSec - months * 262800;
        }
    }

    private void days() {
        if (userSec >= 86400 && userSec <= 262800) {
            int days = userSec / 86400;
            list.add(days);
            time.add("дней");
            userSec = userSec - days * 86400;
        }
    }

    private void hours() {
        if (userSec <= 86400 && userSec >= 3600) {
            int hours = userSec / 3600;
            list.add(hours);
            time.add("час");
            userSec = userSec - hours * 3600;
        }
    }

    private void min() {
        if (userSec <= 3600 && userSec >= 60) {
            int min = userSec / 60;
            list.add(min);
            time.add("минуту");
            userSec = userSec - min * 60;
        }
    }

    private void sec() {
        list.add(userSec);
        time.add("секунды");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 2) {
                result.append(list.get(i)).append(" ").append(time.get(i)).append(" и ");
            } else {
                result.append(list.get(i)).append(" ").append(time.get(i)).append(" ");
            }
        }
        return result.toString();
    }
}
