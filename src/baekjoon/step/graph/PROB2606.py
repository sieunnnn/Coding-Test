# 1 번 컴퓨터가 웜 바이러스에 걸렸을 때, 1 번 컴퓨터를 통해 웜 바이러스에 걸리게 되는
# 컴퓨터의 수를 출력하시오.


import sys
sys.setrecursionlimit(10**6)


# 컴퓨터의 수 입력받기
N = int(input())

# 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. (간선)
M = int(input())

# 그래프 만들기
# 1 번 노드와 인덱스 값이 같게 하기 위해서 N + 1 로 둔다.
graph = [[] for i in range(N + 1)]

for i in range(M) :
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)

# 방문 리스트
vistied = [False] * (N +1)

# 바이러스에 걸리게 되는 컴퓨터의 수 cnt
cnt = 0

# DFS 함수 만들기
def dfs(v) :
    global cnt
    vistied[v] = True
    graph[v].sort()

    for i in graph[v] :
        # 방문한 곳이 아니라면 True 로 변경
        if vistied[i] == False :
            cnt += 1
            dfs(i)

# 함수 호출
dfs(1)

# 바이러스에 걸린 컴퓨터 수 출력
print(cnt)