# 첫번째 줄 N : 정점의 수  M : 간선의 수 R : 시작 정점
# 두번째 줄 u : 정점 v : 가중치 1 인 양방향 간선


import sys
# 재귀 에러 방지
sys.setrecursionlimit(10**6)


N, M, R = map(int, input().split())

# 그래프 생성
# 1 번 노드와 인덱스 값이 같게 하기 위해서 N + 1 로 둔다.
graph = [[] for i in range(N + 1)]

for i in range(M) :
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)

# 방문 리스트
visited = [0] * (N + 1)

# 방문 순서
visited_order = 1

# DFS 함수
def dfs(v) :
    global visited_order
    visited[v] = visited_order
    # 정점을 오름차순으로 방문한다고 했으므로, 그래프를 정렬 해준다.
    graph[v].sort()

    for i in graph[v] :
        # 방문한 노드가 이전에 방문한 곳이 아니라면 순서를 올려준다.
        if visited[i] == 0 :
            visited_order += 1
            dfs(i)

# 함수 호출
dfs(R)

# 방문 순서 출력
for i in range(1, N + 1) :
    print(visited[i])