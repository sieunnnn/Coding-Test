# 첫째 줄에는 테스트 케이스의 개수 C 가 주어진다.
# 둘째 줄부터 각 테스트 케이스 마다 학생의 수 N 이 첫 수로 주어지고, 이어서 N 명의
# 점수가 주어진다. 각 케이스 마다 한 줄 씩 평균을 넘는 학생들의 비율을 반올림 하여
# 소수점 셋째 자리까지 출력 한다.

import sys

N = int(input())

for _ in range(N):
    scores = list(map(int, sys.stdin.readline().split()))
    average = sum(scores[1:])/scores[0]
    count = 0

    for score in scores[1:]:
        if score > average:
            count += 1

    rate = count/scores[0] *100

    print(f'{rate:.3f}%')