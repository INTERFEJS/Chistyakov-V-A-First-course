# -- coding: utf-8 --
def funct(A, B):
    C = A+1
    if A > B:
        for i in range (B, C):
            if i % 2 != 0:
                u = i
                print(u)
    else:
        print("A < B")
funct(int(input("Введите A: ")), int(input("Введите B: ")))