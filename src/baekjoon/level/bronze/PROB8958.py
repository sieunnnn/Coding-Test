# 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O 의 개수가 된다.

import sys

T = int(input())

for i in range(T):
    results = list(sys.stdin.readline())
    results.remove('\n')

    # 새로운 리스트 받을 때마다 리셋 해야 한다.
    score = 0
    total = 0

    for result in results:
        if result == 'O':
            score += 1
            total += score
        else:
            score = 0
    print(total)