# -- coding: utf-8 --
def func(A, B):
    C = B + 1
    if A <= B:
        for i in range (A, C):
            print(i, end = "; ")
    else:
        print("B меньше А")
func(int(input("Введите A: ")), int(input("Введите B (больше или равно А): ")))