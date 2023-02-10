# -- coding: utf-8 --
def func(N):
    f1 = 0
    f2 = f3 = 1
    s = []
    s.append(f1)
    s.append(f2)
    s.append(f3)
    for i in range(3, N):
        sm = f2 + f3
        f2 = f3
        f3 = sm
        s.append(f3)
    print(sum(s))
func(int(input("Введите N: ")))