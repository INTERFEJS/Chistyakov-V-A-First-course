# -- coding: utf-8 --
def func(N):
    i = 2
    if N >= 2:
        while i <= N:
            if N % i == 0:
                print(i)
                break
            i += 1
    else:
        print("Введённое число меньше чем 2")
func(int(input("Введите число (число >= 2): ")))