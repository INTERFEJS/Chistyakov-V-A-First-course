# -- coding: utf-8 --
from functools import reduce  #функция позволяет применить mul ко всей последовательности
from operator import mul      #перемножает первое и последующее число последовательности
def func(n):
    s = []                    #Тут будет храниться последавательность
    for i in range(1, n+1):
        s.append(i)
    print("n! = ", reduce(mul, s))
func(int(input("Введите n: ")))