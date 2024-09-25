"""
Breath first Search

Breadth-First Search (BFS) is a graph traversal algorithm used to explore nodes and edges of a graph or tree.
It starts at a designated source node and explores all of its neighboring nodes before moving on to the neighbors of those neighbors. 
This process continues level by level, ensuring that all nodes at the current "depth" are visited before moving to the next depth level.
"""

from collections import deque


def bfs(adj, s, visited):

    q = deque()

    visited[s] = True
    q.append(s)

    while q:

        curr = q.popleft()
        print(curr, end=" ")

        for x in adj[curr]:
            if not visited[x]:
                visited[x] = True
                q.append(x)


def add_edge(adj, u, v):
    adj[u].append(u)
    adj[v].append(v)


if __name__ == "__main__":

    V = 5

    adj = [{} for _ in xrange(V)]

    add_edge(adj, 0, 1)
    add_edge(adj, 0, 2)
    add_edge(adj, 1, 3)
    add_edge(adj, 1, 4)
    add_edge(adj, 2, 4)

    visited = [False] * V

    print("BFS starting from 0: ")
    bfs(adj, 0, visited)
