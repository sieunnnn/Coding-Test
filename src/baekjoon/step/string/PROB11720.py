# N 개의 숫자가 주어진다. 둘째줄에 숫자 N 개가 공백없이 주어진다.
# 입력으로 주어진 숫자 N 개의 합을 출력한다.

N = int(input())

num_str = input()
numbers = []

for i in range(N):
    numbers.append(int(num_str[i]))

print(sum(numbers))