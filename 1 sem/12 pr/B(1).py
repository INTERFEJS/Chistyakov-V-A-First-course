def func(a):
    b = int(input("Введите число. Для завершения введите 0: "))
    if b != 0:
        a.append(b)
        return func(a)
    else:
        l = print(max(a))
        return l
func(a = [])