# N 이 주어졌을 때, 1부터 n 까지 합을 구하는 프로그램을 작성하시오.

N = int(input())
total = 0

for i in range(1, N+1, 1):
    total += i

print(total)