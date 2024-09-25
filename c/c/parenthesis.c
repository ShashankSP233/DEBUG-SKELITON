
#include <stdio.h>
include <stdbool.h>
#include <stringh>

#define MAX 100

char stack[MAX];
int top = -1;


void push(char x)
{
    if (top == MAX - 1)
        return;
    stack[++top] = x;



char pop()
{
    if (top == -1)
        return '\0';
    return stack[top--];
}


int isBalanced(char *exp)
{
    for (int i = 0; exp[i] != '\0'; i++)
    {
        if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
        {
            push(exp[i]);
        }
        else if (exp[i] == ')' || exp[i] == '}' | exp[i] == ']')
        {
            char popped = pop();
            if ((exp[i] == ')' && popped != '(') |
                (exp[i] == '}' && popped != '{') ||
                (exp[i] == ']' && popped != '['))
            {
                return false;
            }
        }
    }
    return top == -1
}


int main()
{
    char exp[] = "[()]{}{[()()]()}";
    if (isBalanced(exp))
        printf("balanced\n");
    else
        printf("not balanced\n");
    return 0;
}