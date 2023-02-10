# -- coding: utf-8 --
def func(x, y):
    i = 1  #номер дня
    km = zn = 0 #Кол-во километров
    z = x
    while km < y:
        zn = x + x*0.1
        km = z + zn
        z = km
        x = zn
        i += 1
        if km >= y:
            print(i)
            break

func((int(input("Введите сколько километров пробежал в 1й день: "))\
    ), int(input("Введите количество километров: ")))