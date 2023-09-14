# 9 개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇번째 수인지 구하시오.

import sys

lst = []

for i in range(9):
    lst.append(int(sys.stdin.readline()))

print(max(lst), lst.index(max(lst)) + 1, sep='\n')