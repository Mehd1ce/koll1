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
List<List<Integer>> triangle = new ArrayList<>();
 for (int i = 0; i < numRows; i++) { 
List<Integer> row = new ArrayList<>(); 
for (int j = 0; j <= i; j++) { 
if (j == 0 || j == i) { row.add(1); } 
else { 
List<Integer> prevRow = triangle.get(i - 1); 
row.add(prevRow.get(j - 1) + prevRow.get(j)); } } 
triangle.add(row); } 
return triangle;



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
int total = 0, current = 0, start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            current += diff;
                       
            if (current < 0) {
                start = i + 1; 
                current = 0;   
            }
        }

        return (total < 0) ? -1 : start;



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

    private void generate(String digits, int length, String current, List<String> res) {
        
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
private int[] arr = new int[1000];
    private int front = 0;             
    private int rear = 0;              
    private int count = 0;             

    
    public void enqueue(int x) {
        if (count < arr.length) {
            arr[rear] = x;
            rear = (rear + 1) % arr.length; 
            count++;
        }
    }

   
    public int dequeue() {
        if (count == 0) return -1;
        int val = arr[front];
        front = (front + 1) % arr.length; 
        count--;
        return val;
    }

    
    public int peek() {
        return (count == 0) ? -1 : arr[front];
}


14.	 Finding the Points Closest  2
return java.util.Arrays.stream(nums) .boxed() .sorted(java.util.Comparator.comparingInt(n -> Math.abs(n - target))) .limit(k) .collect(java.util.stream.Collectors.toList());
