# -- coding: utf-8 --
def func(N):
    zn = zn1 = 0
    i = 1
    v = 1
    ch = vt = 2
    while zn <= N:
        while v != i:
            zn = ch * vt
            ch = zn
            v += 1
        if zn > N:
            break
        zn1 = zn
        i += 1
    print("Степень:", str(zn1) + ";", "Показатель:", i-1)
func(int(input("Введите N: ")))