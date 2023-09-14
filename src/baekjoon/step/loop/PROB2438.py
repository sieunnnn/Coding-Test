# 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N 번째 줄에는 별 N 개를 찍는 문제

N = int(input())

for i in range(1, N + 1):
    print("*" * i)
