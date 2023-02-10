# -- coding: utf-8 --
print ("Введите количество секунд:")
seconds = input()
seconds = int(seconds)
if seconds >= 0:
    day = seconds // 86400
    ost = seconds % 86400
    hour = ost // 3600
    ost2 = ost % 3600
    minutе = ost2 // 60
    sec = ost2 % 60
    seconds = str(seconds)
    print ("В", seconds + "сек:", day, "дней;", hour, "часов;", minutе, "минут;", sec, "секунд.")