# -- coding: utf-8 --
#Вариант-13
import math
corner_X = 0
corner_Y = 0
corner_Z = 0
x1 = 0
x2 = 0
y1 = 0
y2 = 0
z1 = 0
z2 = 0
def func_X():
    print("Введите значения для точки X: ")
    global x1, x2
    x1 = int(input("Введите x: "))
    x2 = int(input("Введите y: "))
    global corner_X 
    corner_X = abs((math.atan(x2/x1))*(180/3.14))
func_X()

def func_Y():
    print("Введите значения для точки Y: ")
    global y1, y2
    y1 = int(input("Введите x: "))
    y2 = int(input("Введите y: "))
    global corner_Y 
    corner_Y = abs((math.atan(y2/y1))*(180/3.14))
func_Y()

def func_Z():
    print("Введите значения для точки Z: ")
    global z1, z2
    z1 = int(input("Введите x: "))
    z2 = int(input("Введите y: "))
    global corner_Z 
    corner_Z = abs((math.atan(z2/z1))*(180/3.14))
func_Z()


if corner_X < corner_Y and corner_X < corner_Z:
    print("Минимальный угол между точкой X, её координаты:", x1, x2 )
elif corner_Y < corner_X and corner_Y < corner_Z:
    print("Минимальный угол между точкой Y, её координаты:", y1, y2 )
elif corner_Z < corner_X and corner_Z < corner_Y:
    print("Минимальный угол между точкой Z, её координаты:", z1, z2 )
else:
    print("Присутствуют одинаковые точки")