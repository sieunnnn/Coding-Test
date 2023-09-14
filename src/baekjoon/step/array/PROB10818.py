# 첫째 줄에 주어진 정수 N 의 최솟값과 최대값을 공백으로 구분해 출력한다.

import sys

N = int(input())
lst = list(map(int, sys.stdin.readline().split()))

print(min(lst), max(lst), sep=" ")