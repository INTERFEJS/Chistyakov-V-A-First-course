# -- coding: utf-8 --
def funct (n, m, k):
    if k < n * m and ((k % n == 0) or (k % m == 0)):
        print('Да')
    else:
        print('Нет')
funct (int(input("Долек по ширине: ")), int(input("Долек по высоте: ")), int(input("Количество долек в отломленном кусочке: ")))