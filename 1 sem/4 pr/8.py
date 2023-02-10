# -- coding: utf-8 --
def func(n):
    s = 0
    if n <= 9:
        for i in range (n):
            for a in range (1, i+2):
                print(a, end = '')
            print()
    else:
        print(n > 9)
func(int(input("Введите n <= 9: ")))