# -- coding: utf-8 --
def func(s):
    i = 1
    pr = s
    t = 0
    lst = []
    while s != 0:
        s = int(input("Введите число: "))
        if s!=0:
            t = s
            if t == pr:
                i = i+1
                pr = t
            elif t != pr:
                lst.append(i)
                i = 1
                pr = t
        else:
            lst.append(i)
    print(max(lst))
func(int(input("Введите число: ")))