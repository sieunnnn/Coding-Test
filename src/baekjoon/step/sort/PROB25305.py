# 코딩생활에 N 명의 학생들이 응시했다. 이들 중 점수가 가장 높은 k 명은 상을 받을 것이다.
# 이때 상을 받는 커트라인이 몇 점인지 구해라.
# 커트라인 : 상을 받는 사람들 중 점수가 가장 낮은 사람의 점수


# N 과 k 입력받기
N, k = map(int, input().split())

# 학생들의 점수를 리스트로 입력받기
scores = list(map(int, input().split()))

print(sorted(scores, reverse=True)[k - 1])