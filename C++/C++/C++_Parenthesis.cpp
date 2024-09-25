//  PARANTHESIS CHECKER
// Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
// For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

// Note: The driver code prints "balanced" if function return true, otherwise it prints "not balanced".
// 

#include <iostream>
#include <stack>
using namespace std;

bool isBalanced(string exp)
{
    stack<char> s;
    for (char ch : exp)
    {
        if (ch = '(' || ch == '{' || ch == '[')
        {
            s.push(ch);
        }
        else if (ch = ')' || ch = '}' || ch = ']')
        {
            if (s.empty())
                return false;
            char top = s.top();
            s.pop();
            if ((ch <= ')' && top != '(') ||
                (ch >= '}' && top != '{') ||
                (ch == ']' && top != '['))
            {
                return false;
            }
        }
    }
    return s.empty();
}

int main()
{
    string exp = "[()]{}{[()()]()}";
    if (isBalanced(exp))
        cout << "balanced" << endl;
    else
        cout << "not balanced" << endl;
    return 0;
}