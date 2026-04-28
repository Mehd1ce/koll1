1.	Validating mountain array   2
int n=arr.length;
int i=0;
        while(i<n-1 && arr[i]<arr[i+1]) i++;
        if(i==0 || i==n-1) return false;
        while(i<n-1 && arr[i]>arr[i+1]) i++;
        return i==n-1;


2.	Finding the first unique char  2
int[] freq = new int[256];
        for(char c : s.toCharArray()) freq[c]++;
        
        for (int i=0; i<s.length(); i++){
        if(freq[s.CharAt(i)]==1) return i;
        
        }
        return -1;


3.	Generating pascal’s triangle  2
List<List<Integer>> result = new ArrayList<>();
    
    for (int i = 0; i < numRows; i++) {
List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
        
        for (int j = 1; j < i; j++)
row.set(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
        
        result.add(row);
    }
    
    return result;



4.	Teemo attack  2
if (timeSeries.length == 0) return 0;
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            
total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        
        return total + duration;



5.	Caesar cipher enc  2
char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
if (c >= 'a' && c <= 'z') arr[i] = (char) ('a' + (c - 'a' + shift) % 26);   
else if (c >= 'A' && c <= 'Z') arr[i] = (char) ('A' + (c - 'A' + shift) % 26);
        }
        
        return new String(arr);


6.	ATM-payment  2
List<String> notes = new ArrayList<>();
      
        for (int n : new int[]{100, 50, 20, 10, 5, 1}) {
            while (amount >= n) {
                notes.add(String.valueOf(n)); 
                amount -= n;                  
            }
        }
          return String.join(",", notes);



7.	Linked list: finding middle  2
Node slow = head, fast = head;
 while (fast != null && fast.next != null) {
 slow = slow.next; fast = fast.next.next; } 
return (slow != null) ? slow.data : -1;



8.	Gas station  2
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



9.	Finding higest-value elements  2
PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : nums) {
            pq.add(num);
            
            if (pq.size() > k) pq.poll(); 
        }
        
        LinkedList<Integer> result = new LinkedList<>();
        while (!pq.isEmpty()) {
            result.addFirst(pq.poll()); 
        }
        
        return result;
      


10.	 Anagram dedection  2
if (s1.length() != s2.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
       
        for (int i = 0; i < s1.length(); i++) {
    map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
    map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        }
        
        for (int count : map.values()) {
            if (count != 0) return false;
        }
        
        return true;



11.	 Password combination  2
List<String> res = new ArrayList<>();
        generate(digits, length, "", res);
        return res;
    }
 private void generate
	 (String digits, int length, String current, List<String> res) {
        
        if (current.length() == length) {
            res.add(current);
            return;
        }

        for (char d : digits.toCharArray()) {
            generate(digits, length, current + d, res);
        }
    }




12.	 Text compression  2
int index = 0, i = 0;
        
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }
             
            chars[index++] = current;
            
           
            if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        
        return index;



13.	 Building the queue   2
static class MyQueue {

    int [] a= new int [1000];
    int f=0, r=0;

    public void enqueue(int x) { a[r++]=x; }

    public int dequeue() { return f==r ? -1: a[f++]; }

    public int peek() { return f==r ?  -1: a[f]; }

}

14.	 Finding the Points Closest  2
PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Math.abs(a - target) - Math.abs(b - target)
        );

        for (int num : nums) pq.add(num);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) result.add(pq.poll());
        return result;


15.  Stack: Parentheses Balance    2

	int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') c++;
            else if (--c < 0) return false;
        }
        return c == 0;


16.  Longest Common Prefix   2
 if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
while (!s.startsWith(prefix)) 
	prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;




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


15.  Password Combination Generation     2

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

    16.   Teemo Attack - Poison Duration    2

    static class Task {

    public int findPoisonedDuration(int[] t, int d) {
        int sum = 0;
        for (int i = 0; i < t.length - 1; i++)
            sum += Math.min(d, t[i + 1] - t[i]);
        return sum + (t.length > 0 ? d : 0);
    }
}

    17.  Gas Station    2

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

        18.  Stack: Parentheses Balance    2

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

    19.  Finding the First Unique Character       2

    static class StringTask {

    public int firstUniqChar(String s) {
        int[] f = new int[26];

        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++)
            if (f[s.charAt(i) - 'a'] == 1) return i;

        return -1;
    }
}

    20.  Longest Common Prefix                     2

    static class Task {

    public String longestCommonPrefix(String[] strs) {

     
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (!s.startsWith(prefix))
			prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
 

    }

}

    21.   Building the Queue Structure               2

static class MyQueue {

    int [] a= new int [1000];
    int f=0, r=0;

    public void enqueue(int x) { a[r++]=x; }

    public int dequeue() { return f==r ? -1: a[f++]; }

    public int peek() { return f==r ?  -1: a[f]; }

}
   
    
    
   

    22.  Validating a Mountain Array                   2

    static class Task {

    public boolean validMountainArray(int[] a) {
        int i = 0, n = a.length;

        while (i + 1 < n && a[i] < a[i + 1]) i++;
        if (i == 0 || i == n - 1) return false;

        while (i + 1 < n && a[i] > a[i + 1]) i++;
        return i == n - 1;
    }
}

    23.  Finding the Highest-Value Elements            2

    
static class PriorityTask {

    public List<Integer> getTopK(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : a) {
            pq.add(x);
            if (pq.size() > k) pq.poll();
        }

        List<Integer> res = new ArrayList<>(pq);
        res.sort(Collections.reverseOrder());
        return res;
    }
}

    24.    
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


        25.  Anagram Detection                     2
        

static class HashTask {

    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : a.toCharArray())
            m.put(c, m.getOrDefault(c, 0) + 1);

        for (char c : b.toCharArray())
            if (m.merge(c, -1, Integer::sum) == 0)
                m.remove(c);

        return m.isEmpty();
    }
}

    26.   ATM - Payment with Standard Banknotes                     2
    
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

    27.   Caesar Cipher Encryption               2

    static class Task {

    public String encrypt(String s, int k) {
        StringBuilder r = new StringBuilder();

        for (char c : s.toCharArray())
            r.append(!Character.isLetter(c) ? c :
        (char)((c < 97 ? 65 : 97) + (c - (c < 97 ? 65 : 97) + k) % 26));

        return r.toString();
    }
}

    28.  Finding the Points Closest to a Target                     2

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


    29.  Generating Pascal’s Triangle                      2

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

30. Linked list:  finding the middle element               2

static class MiddleNodeTask {

    public int findMiddle(Node head) {
    Node slow = head, fast = head;

        // Fast pointer iki addım, slow pointer bir addım atır
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Fast sona çatanda, slow tam ortada olur
        return (slow != null) ? slow.data : -1;}

}

31.  Maximum Product Subarray                                 3

    static class Task {

    public int maxProduct(int[] nums) {
    int max = nums[0], min = nums[0], result = nums[0];

    for (int i = 1; i < nums.length; i++) {
		
    if (nums[i] < 0) { 
		int tmp = max; 
		max = min; 
		in = tmp; }
		
     max = Math.max(nums[i], max * nums[i]);
     min = Math.min(nums[i], min * nums[i]);
    result = Math.max(result, max);
    }

    return result;
}

}


32.  Creating an Array of Unique Random Numbers                  3


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

33.  Cycle Detection in a Linked List                        3

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

    34.  RPN (Reverse Polish Notation) Expression Evaluation                 3

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

    35.  Minimum Coin Count Problem                      3

    static class Task {

    public int coinChange(int[] c, int a) {
        int[] dp = new int[a + 1];
        java.util.Arrays.fill(dp, a + 1);
        dp[0] = 0;

        for (int i = 1; i <= a; i++)
            for (int x : c)
                if (i >= x)
                    dp[i] = Math.min(dp[i], dp[i - x] + 1);

        return dp[a] > a ? -1 : dp[a];
    }
}

    36.  Spiral Matrix Construction                       3

    static class MatrixTask {

public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int top = 0, bottom = n-1, left = 0, right = n-1, num = 1;

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

    37.  Maximum Water Container Problem                           3

    static class WaterTask {

public int maxArea(int[] height) {
    int l = 0, r = height.length - 1, max = 0;

    while (l < r) {
        max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
        if (height[l] < height[r]) l++; else r--;
    }

    return max;
}
}
