# -- coding: utf-8 --
def func(n):
    s = []
    for i in range(1, n+1):
        sm = i**3
        s.append(sm)
    print(sum(s))
func(int(input("Введите n: ")))