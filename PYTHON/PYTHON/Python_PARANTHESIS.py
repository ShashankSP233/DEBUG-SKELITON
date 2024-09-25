"""
 Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

"""
def isBalanced(x):
    stack = []

    brackets = {')': '(', '}': '{', ']': '['}
    
    for char in x:

        if char in brackets.values():
            stack.append(char)

        elif char in brackets.keys():

            if stack == [] or stack.pop == brackets[char]:  
                return False

        else:  
            return False

    return stack  

expression = "[()]{}{[()()]()}["
if isBalanced(expression): 
    print("balanced")
else:
    print("not balanced")

