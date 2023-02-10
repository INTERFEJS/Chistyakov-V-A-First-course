# -- coding: utf-8 --
#Вариант-13

def func():
    M = int(input('Введите количество строк: '))
    N = int(input('Введите количество столбцов: '))
    A = []

    #ввод массива
    for i in range (M):
        b = []
        for j in range (N):
            print('Введите [', i,',',j,'] элемент')
            b.append(int(input()))
        A.append(b)
    
    #вывод массива
    print('Исходный массив:')
    for i in range(M):
        for j in range(N):
            print(A[i] [j], end = ' ')
        print()

    print()

    #вносим изменения в массив
    for i in range (M):
        for j in range(N):
            if (i+1) % 2 == 0:
                s = A[i]
                minimum_element = min(s)
                print("Минимальный элемент в", i+1, "-й строке:", minimum_element)
                break
                
func()