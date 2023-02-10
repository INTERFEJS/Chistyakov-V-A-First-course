# -- coding: utf-8 --
def func(N):
    i = 0
    q = 0
    while q < N:
        q = i**2
        if q < N:
            print(q, end = " ")
        i += 1
func(int(input("Введите N: ")))