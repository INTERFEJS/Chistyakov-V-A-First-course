# -- coding: utf-8 --
#Вариант-13
def func(k):
    for index in range (1, k+1):
        first_number = index
        elementary_num = []     #задаём переменные
        final_num = []
        n = 1
        while index >= 10:              #проверяем, является ли числом Армстронга
                ost = index%10
                index //= 10
                elementary_num.append(ost)
                n += 1
        elementary_num.append(index)
        for i in range (len(elementary_num)):
            index = elementary_num[i]**n
            final_num.append(index)
        if sum(final_num) == first_number:
            print(sum(final_num))
        elementary_num.clear
        final_num.clear
        n = 1
func(int(input('Введите число до которого будут выведены числа Армстронга: ')))