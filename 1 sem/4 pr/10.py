# -- coding: utf-8 --
def func(N, K):
    f1 = 0
    f2 = f3 = 1
    if K == 1:
        print(f1, f2, f3, end = ' ')
    elif K == 2:
        print(f2, f3, end = ' ')
    elif K == 3:
        print(f3, end = ' ')
    for i in range(K, N):
        sm = f2 + f3
        f2 = f3
        f3 = sm
        print(f3, end = ' ')
func(int(input("Введите N: ")), int(input('Введите K: ')))