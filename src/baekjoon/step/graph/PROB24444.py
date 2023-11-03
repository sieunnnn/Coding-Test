import sys
from collections import deque
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

# BFS 구현
def bfs(v) :
    global visited_order

    # 큐 구현
    queue = deque([R])
    visited[R] = 1

    while queue :
        v = queue.popleft()

        # 그래프 정렬
        graph[v].sort()

        for i in graph[v] :
            if visited[i] == 0 :
                visited_order += 1
                visited[i] = visited_order
                queue.append(i)

bfs(R)

print(*visited[1:], sep="\n")