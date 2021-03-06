#! /usr/bin/env python
# -*- coding: utf-8 -*-
# Однажды известный профессор обнаружил описания k конечных автоматов. По его мнению, нетривиальность конечного автомата, имеющего n состояний и m переходов, можно описать целым числом d = 19m + (n + 239)*(n + 366) / 2 . Чем больше d, тем больший интерес для науки представляет изучение его свойств.
#
# Помогите профессору вычислить нетривиальность имеющихся у него автоматов.
#
# Входные данные
# Первая строка входного файла INPUT.TXT содержит целое число k (1 ≤ k ≤ 10000) – количество конечных автоматов. Следующие k строк содержат по два целых числа ni (0 ≤ ni ≤ 1000) и mi (0 ≤ mi ≤ 26ni2) – число состояний и переходов i-го автомата.
#
# Выходные данные
# Выходной файл OUTPUT.TXT должен состоять из k строк. На i-й строке выходного файла выведите одно число – нетривиальность i-го автомата.

def formula (n,m):
    d = int(19*m+(n+239)*(n+366)//2)
    return d


array = []
variable= ''
amount = int(input())
for i in range (amount):
    variable = input().split()
    for k in range(len(variable)):
        variable[k] = int(variable[k])
    array.append( formula(variable[0], variable[1]))
for i in array:
    print(i)