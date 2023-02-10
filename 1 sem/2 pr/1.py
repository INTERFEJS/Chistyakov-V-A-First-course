# -- coding: utf-8 --
import math
x = float(input("Введите переменную x: "))
y = float(input("Введите переменную y: "))
z = float(input("Введите переменную z: "))
s = ((2* math.cos(x - 2/3))/(1/2 + math.pow(math.sin(y),2))*(1 + ((math.pow(z,2))/(3-(math.pow(z,2)/5)))))
print("s = {0:.6f}".format(s))