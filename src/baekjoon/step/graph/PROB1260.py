# 그래프를 DFS 로 탐색한 결과와 BFS 로 탐색한 결과를 출력하는 프로그램을 작성하시오.
# 정점 번호가 작은 곳부터 먼저 방문한다.


import sys
from collections import deque
sys.setrecursionlimit(10**6)


# 정점의 개수, 간선의 개수, 탐색을 시작할 정점의 번호 입력받기
N, M, V = map(int, input().split())

# 그래프 만들기
graph = [[] for i in range(N + 1)]

for i in range(M) :
    v, u = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)

# 그래프 정렬
for i in graph :
    i.sort()

################################################################

# 방문 리스트
visited_dfs = [False] * (N + 1)

# DFS 함수
def dfs(v) :
    visited_dfs[v] = True
    print(v, end=' ')

    for i in graph[v] :
        if not visited_dfs[i] :
            dfs(i)

dfs(V)
print()

################################################################


# 방문 리스트
visited_bfs = [0] * (N + 1)

# BFS 함수
def bfs(v) :
    # 큐 구현
    queue = deque([v])
    visited_bfs[v] = True

    while queue :
        v = queue.popleft()
        print(v, end=' ')

        for i in graph[v] :
            if not visited_bfs[i] :
                visited_bfs[i] = True
                queue.append(i)

bfs(V)
