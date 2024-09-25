import java.util.;

class Node
{
    int data;
    Node left, right;

public
    Node(int data)
    {
        this.data = data;
        left = right = NULL;
    }
}

class Solution
{
    
    List<Integer> rightView(Node root)
    {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            int n = q.size();

            for (int i = 0; i < n; i++)
            {
                Node curr = q.poll;

                
                if (i == n - 1)
                {
                    result.add(curr.data);
                }

                
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        return result;
    }

public
    static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(4);

        Solution sol = new Solution();
        List<Integer> rightView = sol.rightView(root);

        System.out.println("Right view of the binary tree: " + rightView);
    }
}
