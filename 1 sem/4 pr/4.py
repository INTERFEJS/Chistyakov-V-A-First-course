# -- coding: utf-8 --
def func(N):
    s = []
    for i in range (N):
        i = int(input("Введите число: "))
        s.append(i)
    print(sum(s))
func(int(input("Введите N: ")))