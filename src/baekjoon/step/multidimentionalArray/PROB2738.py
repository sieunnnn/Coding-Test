# N 개의 줄에 행렬 A 와 B 를 더한 행렬을 출력한다.

N, M = map(int, input().split())

A, B = [], []

for row in range(N):
    row = list(map(int, input().split()))
    A.append(row)

for row in range(N):
    row = list(map(int, input().split()))
    B.append(row)

for row in range(N):
    for col in range(M):
        print(A[row][col] + B[row][col], end=' ')
    print()
