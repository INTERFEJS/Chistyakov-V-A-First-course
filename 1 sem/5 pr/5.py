# -- coding: utf-8 --
def func(s):
    i = 0
    while s != 0:
        i += 1
        s = int(input("Введите число: "))
    print("Количество членов последовательности:", i)
func(int(input("Введите число: ")))