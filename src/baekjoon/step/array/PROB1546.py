# 첫째 줄에 시험 본 과목의 개수 N 이 주어진다. 둘재 줄에 세준이의 현재 성적이 주어진다.
# 첫재 줄에 새로운 평균을 출력한다.

N = int(input())
scores = list(map(int, input().split()))
M = max(scores)

new_score = []

for score in scores:
    new_score.append(score/M*100)

print(sum(new_score) / len(new_score))