# -- coding: utf-8 --
#Вариант-14
def func(N):
    lst = []
    lst.append(N)
    while N != 0:
        N = int(input("Введите число: "))
        if N != 0:
            lst.append(N)
    print("Исходный список:", lst)
    max_count = max(lst)
    min_count = min(lst)
    max_index = lst.index(max(lst))
    min_index = lst.index(min(lst))
    lst.insert(min_index, max_count)
    if max_index >= min_index:    
        lst.pop(max_index+1)
        lst.insert(max_index+1, min_count)
    else:
        lst.pop(max_index)
        lst.insert(max_index, min_count)
    lst.pop(min_index+1)
    print("Изменённый список:", lst)
func(int(input("Введите число (чтобы закончить ввод введите 0): ")))