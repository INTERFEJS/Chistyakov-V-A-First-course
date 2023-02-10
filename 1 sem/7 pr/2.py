# -- coding: utf-8 --
#Вариант-14
def func(number):
    lst = []
    index = 0
    lst.append(number)
    for i in range (9):
        number = int(input("Введите число: "))
        lst.append(number)
    average_count = sum(lst)/10
    print("Изначальный список:", lst)
    print("Среднее арифметическое:", average_count)
    for i in lst:
        index += 1
        if average_count < lst[index-1]:
            lst.insert(index-1, 1)
            lst.pop(index)
    print("Изменённый список:", lst)
func(int(input("Введите число: ")))