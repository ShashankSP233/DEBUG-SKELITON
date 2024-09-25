
#include <stdio.h>
#include <stdlib.h>

define MAX_VERTICES 100

struct Node
{
    int data
    struct Node *next;
};


struct Node *createNode(int data)
{
    struct Node *newNode =
        (struct Node *)malloc(sizeof(struct Node))
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}


void addEdge(struct Node *adj[], int u, int v)
{
    Struct Node *newNode = createNode(v);
    newNode >next = adj[u];
    adj[u] = newNode;

    
    newNode = createNode(u);
    newNode->next = adj[v];
    adj[v] = newNode;
}


void bfs(struct Node *adj[], int vertices,
         int source, int visited[])
{
  
    int queue[MAX_VERTICES];
    int front = 0, rear = 0;

    visited[source] = 1;
    queue[rear++] = source;


    while (front != rear)
    {

        int curr = queue[front++];
        printf("%d ", curr);

   
        struct Node *temp = adj[curr];
        while (temp != NULL)
        {
            int neighbor = temp->data;
            if (!visited[neighbor])
            {
                visited[neighbor] = 1;
                queue[rear++] = neighbor;
            }
            temp = temp->next;
        }
    }
}

int main()
{
    int vertices = 5;

    struct Node *adj[vertices];
    for (int i = 0; i < vertices; ++i)
        adj[i] = NULL;

    addEdge(adj, 0, 1);
    addEdge(adj, 0, 2);
    addEdge(adj, 1, 3);
    addEdge(adj, 1, 4);
    addEdge(adj, 2, 4);

    int visited[vertices];
    for (int i = 0; i < vertices; ++i)
        visited[i] = 0;

    printf("Breadth First Traversal "
           "starting from vertex 0: ");
    bfs(adj, vertices, 0, visited);

    return 0;
}
