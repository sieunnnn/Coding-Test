# 첫째 줄부터 열번째 줄 까지 숫자가  한 줄에 하나씩 주어진다.
# 42 로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

import sys

numbers = []
remainder = []

# 배열 만들기
for i in range(10):
    numbers.append(int(sys.stdin.readline()) % 42)

for number in numbers:
    if number not in remainder:
        remainder.append(number)

print(len(remainder))