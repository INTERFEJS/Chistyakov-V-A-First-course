# -- coding: utf-8 --
def func(A, B):
    if A < B:
        C = B + 1
        for i in range (A, C):
            print(i, end = "; ")
    else:
        C = A + 1
        for i in range (B, C)[::-1]:
            print(i, end = "; ")
func(int(input("Введите A: ")), B = int(input("Введите B: ")))