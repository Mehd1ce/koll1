1. Finding Maximum and Minimum     1

    public int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }


2. Linked List: Adding an Element      1

 static class LinkedListTask {

    Node head, tail;

    public void insertAtEnd(int x) {
        Node n = new Node(x);
        if (head == null) head = tail = n;
        else tail = tail.next = n;
    }
}

 3. Binary Search     1

 public int search(int[] arr, int target) {


    int i =Arrays.binarySearch(arr, target);
    return i >= 0 ? i : -1;
}


    4.  Character Count in a String        1

    static class CharCountTask {

    public int countChar(String s, char c) 
     {  return (int) s.chars().filter(ch -> ch == c).count(); }

}

    5. Implementation of a Deque             1

    static class MyDeque {

    int[] a = new int[1000];
    int f = 500, r = 500;

    public void addFirst(int x) { a[--f] = x; }
    public void addLast(int x)  { a[r++] = x; }
}

    6. Linear Search                   1

    static class SearchTask {

    public int find(int[] arr, int target) {
	    for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }
}

    7. Building of the Stack Structure         1

    static class MyStack {

    int[] a = new int[1000];
    int top = -1;

    public void push(int x) {
        a[++top] = x;
    }

    public int pop() {
        return top == -1 ? -1 : a[top--];
    }

    public int peek() {
        return top == -1 ? -1 : a[top];
    }
}
         
   8.  Finding Duplicate Elements8.           1

static class DuplicateTask {

    public boolean hasDuplicate(int[] arr) {
    return Arrays.stream(arr).distinct().count() != arr.length;
}


    9.  Counting Nodes in a Linked List             1

    static class LinkedListTask {

    Node head;

    public int getSize() {
        int c = 0;
        for (Node t = head; t != null; t = t.next) c++;
        return c;
    }
}
    10.  Palindrome Check (Using Loop)             1

    static class PalindromeTask {

    public boolean isPalindrome(String s){

     return new StringBuilder(s).reverse().toString().equals(s);
    }
}

     
    11.   Building the Node Structure            1

    static class LinkTask {
    public void connect(Node f, Node s) {
        if (f != null) f.next = s;
    }
}

    12.  Dynamic Expansion of an Array Size               1

    return Arrays.copyOf(old, old.length * 2);


13.   Fibonacci Number Calculation            1

static class FibonacciTask {

    public int fib(int n) {
    	if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

}

    14.    Array Reversal           1

    static class ReverseTask {

    public void reverse(int[] arr) {
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }

}


   15.  Symmetric binary tree      1

   public static boolean isSymmetric(TreeNode root) {
    return check(root.left, root.right);
}

static boolean check(TreeNode l, TreeNode r) {
    if (l == null || r == null) return l == r;
    return l.val == r.val && check(l.left, r.right) && check(l.right, r.left);

}

16.  Binary tree height        1


public static int maxDepth(TreeNode root) {
    return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
}
 
17. Two Binary Trees Same Tree (Check if Two Trees are Identical)    1


public static boolean isSameTree(TreeNode p, TreeNode q) {
    return p == q || (p != null && q != null &&
           p.val == q.val &&
           isSameTree(p.left, q.left) &&
           isSameTree(p.right, q.right));
}

18. Binary Tree Post-order Traversal     1

static List<Integer> r = new ArrayList<>();

public static List<Integer> postorderTraversal(TreeNode root) {
    if (root != null) {
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        r.add(root.val);
    }
    return r;
}

  
19.  Binary Tree Pre-order Traversal      1

static List<Integer> r = new ArrayList<>();

public static List<Integer> preorderTraversal(TreeNode root) {
    if (root != null) {
        r.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    return r;
}


20. Binary Tree In-order Traversal        1


static List<Integer> r = new ArrayList<>();

public static List<Integer> inorderTraversal(TreeNode root) {
    if (root != null) {
        inorderTraversal(root.left);
        r.add(root.val);
        inorderTraversal(root.right);
    }
    return r;
}


 21. Balanced binary tree      2
 
 public static boolean isBalanced(TreeNode root) {
    return height(root) != -1;
}
static int height(TreeNode n) {
    if (n == null) return 0;
    int l = height(n.left);
    if (l == -1) return -1;
    int r = height(n.right);
    if (r == -1) return -1;
    return Math.abs(l - r) > 1 ? -1 : 1 + Math.max(l, r);
}


 22.   Finding the maximum degree of a general tree.      2
	 
    if (root == null) return 0;
    int m = root.children.size();
    for (Node c : root.children) m = Math.max(m, getMaxDegree(c));
    return m;




23.  Checking a Full Binary Tree.       2

    if (root == null) return true;
    if ((root.left == null) != (root.right == null)) return false;
    return isFullTree(root.left) && isFullTree(root.right);



24. Checking a Binary Search Tree (BST)    2


public static boolean isValidBST(TreeNode root) {
    return dfs(root, null, null);
}

static boolean dfs(TreeNode n, Integer min, Integer max) {
    if (n == null) return true;
    if (min != null && n.val <= min) return false;
    if (max != null && n.val >= max) return false;
    return dfs(n.left, min, n.val) && dfs(n.right, n.val, max);
}
 



25.   The height of a node in a binary tree.     2

    return root == null ? 0 : 1 + Math.max(getNodeHeight(root.left), getNodeHeight(root.right));



    26.    Root-to-leaf path sum     2

   if (root == null) return false;
    if (root.left == null && root.right == null) return targetSum == root.val;
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);



27.  The depth of a specific node in a binary tree        2

    if (root == null) return -1;
    if (root.val == target) return 0;
    int l = getDepth(root.left, target);
    int r = getDepth(root.right, target);
    return (l == -1 && r == -1) ? -1 : 1 + Math.max(l, r);


28. Password Combination Generation     2

static class SafeTask {

    public List<String> findCodes(String digits, int length) {
        List<String> res = new ArrayList<>();
        generate(digits, length, "", res);
        return res;
    }

    private void generate(String digits, int length, String curr, List<String> res) {
        if (curr.length() == length) {
            res.add(curr);
            return;
        }
        for (char c : digits.toCharArray()) 
            generate(digits, length, curr + c, res);
    }
}

    29.   Teemo Attack - Poison Duration    2

    static class Task {

    public int findPoisonedDuration(int[] t, int d) {
        int sum = 0;
        for (int i = 0; i < t.length - 1; i++)
            sum += Math.min(d, t[i + 1] - t[i]);
        return sum + (t.length > 0 ? d : 0);
    }
}

    30.  Gas Station    2

    static class Task {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, tank = 0, total = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return total < 0 ? -1 : start;
    }
}

        31  Stack: Parentheses Balance    2

        static class BracketTask {

    public boolean isBalanced(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') c++;
            else if (--c < 0) return false;
        }
        return c == 0;
    }
}

    32.  Finding the First Unique Character       2

    static class StringTask {

    public int firstUniqChar(String s) {

        for(int i=0; i<s.length(); i++) {
            char c= s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) return i; }
            

        return -1;

    }

}



    33.  Longest Common Prefix                     2

    static class Task {

    public String longestCommonPrefix(String[] strs) {

     
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (!s.startsWith(prefix)) prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
 

    }

}

    34   Building the Queue Structure               2

static class MyQueue {

    int [] a= new int [1000];
    int f=0, r=0;

    public void enqueue(int x) { a[r++]=x; }

    public int dequeue() { return f==r ? -1: a[f++]; }

    public int peek() { return f==r ?  -1: a[f]; }

}
   
    
    
   

    35.  Validating a Mountain Array                   2

    static class Task {

    public boolean validMountainArray(int[] a) {
        int i = 0, n = a.length;

        while (i + 1 < n && a[i] < a[i + 1]) i++;
        if (i == 0 || i == n - 1) return false;

        while (i + 1 < n && a[i] > a[i + 1]) i++;
        return i == n - 1;
    }
}

    36.  Finding the Highest-Value Elements            2

static class PriorityTask {

    public List<Integer> getTopK(int[] nums, int k) {
		List<Integer> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=nums.length-k;i--)
            res.add(nums[i]);
        return res;
        

    }

}

    37.    
    Text Compression (Run-Length Encoding)           2

    static class Task {

    public int compress(char[] c) {
        int w = 0;

        for (int i = 0; i < c.length; ) {
            char ch = c[i];
            int j = i;

            while (j < c.length && c[j] == ch) j++;

            c[w++] = ch;

            if (j - i > 1)
                for (char x : (j - i + "").toCharArray())
                    c[w++] = x;

            i = j;
        }
        return w;
    }
}


        38.  Anagram Detection                     2
        

static class HashTask {

    public boolean isAnagram(String s1, String s2) {
   char[] x = s1.toCharArray(), y = s2.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    return Arrays.equals(x, y);
    }
}

    39.   ATM - Payment with Standard Banknotes                     2
    
    static class ATMTask {

    public String calculateATM(int a) {
        int[] d = {100, 50, 20, 10, 5, 1};
        StringBuilder s = new StringBuilder();

        for (int x : d)
            while (a >= x) {
                if (s.length() > 0) s.append(",");
                s.append(x);
                a -= x;
            }

        return s.toString();
    }

    40.   Caesar Cipher Encryption               2

    static class Task {

    public String encrypt(String s, int k) {
        StringBuilder r = new StringBuilder();

        for (char c : s.toCharArray())
            r.append(!Character.isLetter(c) ? c :
                (char)((c < 97 ? 65 : 97) + (c - (c < 97 ? 65 : 97) + k) % 26));

        return r.toString();
    }
}

    41.  Finding the Points Closest to a Target                     2

    static class PriorityTask {
    public List<Integer> findClosest(int[] nums, int k, int target) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Math.abs(a - target) - Math.abs(b - target)
        );

        for (int num : nums) pq.add(num);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) result.add(pq.poll());
        return result;
    }
}


    42.  Generating Pascal’s Triangle                      2

    static class Task {

public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    
    for (int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
        
        for (int j = 1; j < i; j++)
            row.set(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
        
        result.add(row);
    }
    
    return result;
}
}

43. Linked list:  finding the middle element               2

static class MiddleNodeTask {

    public int findMiddle(Node h) {
    Node s = h, f= h;
        while (f != null && f.next != null) {
            s= s.next;
            f = f.next.next;
        }
        return (s != null) ? s.data : -1;}

}


        44.  Checking a Perfect Binary Tree       3

        public static boolean isPerfect(TreeNode root) {
    int h = height(root);
    return count(root) == (Math.pow(2, h) - 1);
}

static int height(TreeNode n) { return n == null ? 0 : 1 + height(n.left); }
static int count(TreeNode n) { return n == null ? 0 : 1 + count(n.left) + count(n.right); }


45    Checking a Complete Binary Tree      3


public static boolean isComplete(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
    while (q.peek() != null) {
        TreeNode n = q.poll();
        q.add(n.left);
        q.add(n.right);
    }
    while (!q.isEmpty() && q.peek() == null) q.poll();
    return q.isEmpty();
}


46.   Convert a binary tree into a multi-level linked list         3
 
public static MultiNode convertToMultiLevel(TreeNode root) {
    if (root == null) return null;
    
    MultiNode node = new MultiNode(root.val);
    node.child = convertToMultiLevel(root.left);
    node.next = convertToMultiLevel(root.right);
    
    return node;
}

   47. Balanced BST from a sorted array       3

public static TreeNode sortedArrayToBST(int[] nums) {
    return build(nums, 0, nums.length - 1);
}
static TreeNode build(int[] a, int l, int r) {
    if (l > r) return null;
    int m = (l + r) / 2;
    return new TreeNode(a[m], build(a, l, m - 1), build(a, m + 1, r));
}


48.  Binary Tree Level-order Traversal    3


public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    dfs(root, 0, res);
    return res;
}

static void dfs(TreeNode node, int level, List<List<Integer>> res) {
    if (node == null) return;
    if (level == res.size()) res.add(new ArrayList<>());
    res.get(level).add(node.val);
    dfs(node.left, level + 1, res);
    dfs(node.right, level + 1, res);
}


49.   Maximum Product Subarray                                 3

    static class Task {

    public int maxProduct(int[] nums) {
    int max = nums[0], min = nums[0], result = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < 0) { int tmp = max; max = min; min = tmp; }
        max = Math.max(nums[i], max * nums[i]);
        min = Math.min(nums[i], min * nums[i]);
        result = Math.max(result, max);
    }

    return result;
}

}


50.  Creating an Array of Unique Random Numbers                  3


static class RandomTask {

    public int[] generateUniqueArray(int n) {
    int[] result = new int[n];
    Random rand = new Random();

    for (int i = 0; i < n; ) {
        int num = rand.nextInt(n) + 1;
        boolean exists = false;
        for (int j = 0; j < i; j++)
            if (result[j] == num) { exists = true; break; }
        if (!exists) result[i++] = num;
    }

    return result;
}

}

51.  Cycle Detection in a Linked List                        3

static class ListTask {

    public boolean hasCycle(ListNode h) {
        ListNode s = h, f = h;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }

        return false;
    }
}

  52  RPN (Reverse Polish Notation) Expression Evaluation                 3

    static class RPNTask {

public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String t : tokens) {
        if ("+-*/".contains(t)) {
            int b = stack.pop(), a = stack.pop();
            stack.push(t.equals("+") ? a+b : t.equals("-") ? a-b : t.equals("*") ? a*b : a/b);
        } else {
            stack.push(Integer.parseInt(t));
        }
    }

    return stack.pop();
}

}

    53  Minimum Coin Count Problem                      3

    static class Task {

    public int coinChange(int[] c, int a) {
        int[] dp = new int[a + 1];
        Arrays.fill(dp, a + 1);
        dp[0] = 0;

        for (int i = 1; i <= a; i++)
            for (int x : c)
                if (i >= x)
                    dp[i] = Math.min(dp[i], dp[i - x] + 1);

        return dp[a] > a ? -1 : dp[a];
    }
}

    54.  Spiral Matrix Construction                       3

    static class MatrixTask {

public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int left=0,top=0,right=n-1,bottom=n-1, num =1;

    while (num <= n * n) {
        for (int i = left;  i <= right;  i++) matrix[top][i]    = num++;
        for (int i = top+1; i <= bottom; i++) matrix[i][right]  = num++;
        for (int i = right-1; i >= left; i--) matrix[bottom][i] = num++;
        for (int i = bottom-1; i > top; i--) matrix[i][left]   = num++;
        top++; bottom--; left++; right--;
    }

    return matrix;
}

}

   55.  Maximum Water Container Problem                           3

    static class WaterTask {

public int maxArea(int[] h) {
    int l = 0, r = h.length - 1, max = 0;

    while (l < r) {
        max = Math.max(max, (r - l) * Math.min(h[l], h[r]));
        if (h[l] < h[r]) l++; else r--;
    }

    return max;
}
}
