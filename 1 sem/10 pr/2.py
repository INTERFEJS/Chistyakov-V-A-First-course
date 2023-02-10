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
        sys.stdout = output
            
func()