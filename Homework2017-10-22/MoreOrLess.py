#  двух строчках входного файла INPUT.TXT записаны числа A и B, не превосходящие по абсолютной величине 2×109.
#
# Выходные данные
# Запишите в выходной файл OUTPUT.TXT один символ “<”, если A < B, “>”, если A > B и “=”, если A=B.

a = int(input())
b = int(input())
if a > b:
    print('>')
elif a < b:
    print('<')
elif a == b:
    print('=')