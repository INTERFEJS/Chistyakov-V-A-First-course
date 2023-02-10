# -- coding: utf-8 --
def funct (a, b ,c):
    if a == b and a == c:
        print("3")
    elif (a == b and a != c) or (a != b and a == c) or (c == b and c != a):
        print ("2")
    elif a != b and a != c and c != b:
        print  ("0")
funct(int(input("Введите первое число: ")), int(input("Введите второе число: ")), int(input("Введите третье число: ")))