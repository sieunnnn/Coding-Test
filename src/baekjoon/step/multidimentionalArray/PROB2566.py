# 최댓값을 찾는 문제

import sys

numbers = []

for i in range(9):
    numbers.append(list(map(int, sys.stdin.readline().split())))

row_index = 0
col_index = 0
max = -1

for i in range(9):
    for j in range(9):
        if numbers[i][j] > max:
            max = numbers[i][j]
            row_index = i + 1
            col_index = j + 1

print(max)
print(row_index, col_index)