# -- coding: utf-8 --
print ("Введите число для проверки")
number = input()
number = int(number)
if number % 2 == 0:
    print ("Число", number, "является четным")
else:
    print ("Число", number, "является нечетным")