# 문자열 S 를 입력받은 후에, 각 문자를 R 번 반복해 새 문자열 P 를 만든 후 출력하는
# 프로그램을 작성하시오. 즉, 첫 번째 문자를 R 번 반복하고, 두 번째 문자를 R 번
# 반복하는 식으로 P 를 만들면 된다.
# 첫째 줄에 테스트 케이스의 개수 T 가 주어진다.
# 각 테스트 케이스는 반복횟수 R, 문자열 S 가 공백으로 구분되어 주어진다.

import sys

T = int(input())

for i in range(T):
    R, S = map(str, sys.stdin.readline().split())
    result = ""
    for j in S:
        result += int(R) * j
    print(result)