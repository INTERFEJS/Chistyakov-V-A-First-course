# -- coding: utf-8 --
#Вариант-14
def func(string_new):
    first_s = 'а'
    last_s = 'я'
    for i in string_new.split():
        if (i.startswith(first_s)) or (i.endswith(last_s)):
            print(i, end = ', ')
func(str(input("Введите слова через пробел со строчной буквы: ")))