# 첫째 줄에 카드의 개수 N  과 M 이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어진다.
# 합이 M 을 넘지 않는 카드 3 장을 찾을 수 있는 경우만 입력으로 주어진다.
# N 장의 카드에 써져 있는 숫자가 주어졌을 때, M 을 넘지 않으면서 M 에 최대한 가까운
# 카드 3 장의 합을 구해 출력하시오.

from itertools import combinations

# N 과 M 입력받기
N, M = map(int, input().split())

# 카드에 쓰여 있는 수 입력받기
numbers = list(map(int, input().split()))

# 카드 3개를 뽑는 케이스 구하기 (조합)
combinations = list(combinations(numbers, 3))

# 각 조합의 합을 구하기
sum_combi = []

for combination in combinations:
    sum_combi.append(sum(combination))

# M 을 넘지 않으면서 M 에 최대한 가까운 카드 3장의 합을 구하기
meet_condition = []

for sum in sum_combi:
    if (M - sum) >= 0:
        meet_condition.append(sum)

print(max(meet_condition))
