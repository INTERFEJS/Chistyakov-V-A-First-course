# -- coding: utf-8 --
def func(s):
    i = 0
    pr = s
    t = 0
    while s != 0:
        s = int(input("Введите число: "))
        if s!=0:
            t = s
            if t > pr:
                i = i+1
                pr = t
            else:
                pr = t
    print(i)
func(int(input("Введите число: ")))