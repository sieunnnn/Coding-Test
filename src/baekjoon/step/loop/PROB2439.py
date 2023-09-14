# 오른쪽 기준으로 정렬한 별찍기

N = int(input())

for i in range(1, N + 1):
    print(" " * (N- i) + "*" * i)
