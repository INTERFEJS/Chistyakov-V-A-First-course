# -- coding: utf-8 --
def func(n):
    sm = 0
    fac = 1
    for i in range(1, n+1):
        tfuc = fac * i
        sm = sm + tfuc
        fac = tfuc
    print(sm)
func(int(input("Введите n: ")))