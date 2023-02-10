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
    min_count = min(map(min, A))
    max_count = max(map(max, A))
    print("Минимальное значение:", min_count)
    print("Максимальное значение:", max_count)
    print()
    
    for i in range(M):
        for j in range(N):
            if A[i][j] == min_count:
                min_line = i
                min_column = j
            if A[i][j] == max_count:
                max_line = i
                max_column = j
    A[min_line][min_column] = max_count
    A[max_line][max_column] = min_count

    #вывод обновлённого массива
    print("Изменённый массив:")
    for i in range(M):
        for j in range(N):
            print(A[i] [j], end = ' ')
        print()
            
func()