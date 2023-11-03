# 1 은 집이 있는 곳을, 0 은 집이 없는 곳을 나타낸다.
# 입력
# N : 지도의 크기 (N * N)
# 출력
# 총 단지 수 와 각 단지내 집의 수를 오름차순으로 정렬


import sys


# N 입력받기
N = int(input())

# 그래프 만들기
graph = []
for i in range(N) :
    graph.append(list(map(int, sys.stdin.readline().rstrip())))

# DFS 함수
def dfs(x, y):
    # 범위를 벗어나면 바로 종료
    if x < 0 or x >= N or y < 0 or y >= N:
        return False

    # 집이 있는 경우
    if graph[x][y] == 1:
        global cnt_house
        cnt_house += 1
        graph[x][y] = 0

        # 상, 하, 좌, 우 모두 재귀적으로 호출한다.
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x, y - 1)
        dfs(x, y + 1)
        return True

    return False

# 결과 출력
cnt_house = 0
result = 0
house_num_arr = []

for i in range(N):
    for j in range(N):
        if dfs(i, j) == True:
            house_num_arr.append(cnt_house)
            result += 1
            # 초기화
            cnt_house = 0

# 각 단지내의 집의 수를 오름차순으로 정렬
house_num_arr.sort()

# 단지의 개수
print(result)

# 단지내의 집 개수
print(*house_num_arr, sep='\n')
