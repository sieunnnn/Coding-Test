# 퀵정렬로 N 개의 수를 오름차순으로 정렬하기
import sys

# 숫자를 담을 배열 만들기
numbers = []

# N 입력받기
N = int(input())

# 숫자 입력받기
for i in range(N) :
    numbers.append(int(sys.stdin.readline()))

print(*sorted(numbers), sep='\n')