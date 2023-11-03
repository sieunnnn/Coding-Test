# N 개의 정점과 M 간선으로 구성된 무방향 그래프가 주어진다.
# 정점 번호는 1 번부터 N 번이고 모든 간선의 가중치는 1 이다.
# 정점 R 에서 시작하여 깊이 우선 탐색으로 노드를 방문할 경우 노드의 방문 순서를 출력하자.
# 인접 정점은 내림차순으로 방문한다.
# 방문 안한 노드는 0


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
    graph[v].sort(reverse=True)

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