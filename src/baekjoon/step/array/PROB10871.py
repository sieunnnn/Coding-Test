# X 보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다.
import sys

N, X = map(int, input().split())
lst = list(map(int, sys.stdin.readline().split()))

for number in lst:
    if number < X:
        print(number, end =" ")