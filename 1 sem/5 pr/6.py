# -- coding: utf-8 --
def func(s):
    i = 0
    lst = []
    lst.append(s)
    while s != 0:
        i += 1
        s = int(input("Введите число: "))
        lst.append(s)
    print((sum(lst))/(i+1)) # С учетом 0
func(int(input("Введите число: ")))