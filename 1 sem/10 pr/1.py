# -- coding: utf-8 --
#Вариант-13

def func():
    import sys

    M = 0
    N = 0
    A = []
    s = []
    column_index = 1
    line_index = 0
    output = sys.stdout

    #ввод массива и расчек количества строк
    with open ('10 pr\\Chistyakov-V-A_y-223_vvod.txt', 'r') as file:
        for line in file:
            line_index += 1
            s = line.split()
            s = list(map(int, s))
            A.append(s)
        M = line_index
        line_index = 0

    #расчет количества столбцов
    with open ('10 pr\\Chistyakov-V-A_y-223_vvod.txt', 'r') as file:
        for line in file:
            line_index += 1
            if line_index <= 1:
                for a in line:
                    if a == ' ':
                        column_index += 1
            else:
                break
        N = column_index

    #вывод массива
    with open ('10 pr\\Chistyakov-V-A_y-223_vivod.txt', 'w', encoding='utf-8') as file:
        sys.stdout = file
        print('Исходный массив:')
        for i in range(M):
            for j in range(N):
                print(A[i] [j], end = ' ')
            print()

        print()

    #выполняем расчеты в матрице
        for i in range (M):
            for j in range(N):
                if (i+1) % 2 == 0:
                    s = A[i]
                    minimum_element = min(s)
                    print("Минимальный элемент в", i+1, "-й строке:", minimum_element)
                    break
        sys.stdout = output
        
func()