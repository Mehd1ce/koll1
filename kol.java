1.fibonacci/With recursive
İf(n<=1) return n;
return solution(n-1)+solution(n-2);

2.Sum of Fib numbers
public class Solution {
public static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
  public static long fibonacciSum(int n) {
        return fibonacci(n + 2) - 1;
    }}

3 Sum of even fibonacci
public class Solution {

    public static long fibonacciEvenSum(int n) {
        long a = 0, b = 1, sum = 0;

        for (int i = 0; i <= n; i++) {
            if (a % 2 == 0) sum += a;
            long next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}


4. Sum of odd fibonacci
public class Solution {

    public static long fibonacciEvenSum(int n) {
        long a = 0, b = 1, sum = 0;

        for (int i = 0; i <= n; i++) {
            if (a % 2 != 0) sum += a;
            long next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }}

5. factorial
if (n <= 1) {
return 1;
}
return n * factorial(n - 1);

6. sum of even factorials
public class Solution {
public static long factorialEvenSum(int n) {
        long sum=0;
        for (int i=0; i<=n; i+=2){
        sum+=factorial(i);
        }
        return sum;
    }
}

7. sum of odd factorilas
public class Solution {
    public static long factorialEvenSum(int n) {
        long sum=0;
        for (int i=1; i<=n; i+=2){
        sum+=factorial(i);
        }
        return sum;
    }
}
8. sum of factorials
long sum=1, fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;
sum+=fact;
        } return sum;


9. Remove duplicates from a list
public class Solution {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        // Write code here
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}


10. nice number 
if (n <= 0) return false;

while (n % 2 == 0) n /= 2;
while (n % 3 == 0) n /= 3;
while (n % 5 == 0) n /= 5;
return n > 1;

11. ugly number
if (n <= 0) return false;
while (n % 2 == 0) n /= 2;
while (n % 3 == 0) n /= 3;
while (n % 5 == 0) n /= 5;

return n ==1;

12.Find Missing Numbers
        int sum = 0;
        for (int x : nums) sum += x;
        int n = nums.length;
        return n * (n + 1) / 2 - sum;

13. Maximum Product Subarray
int max=nums[0], min=nums[0], result=nums[0];
        for (int i=1; i<nums.length; i++){
        if (nums[i]<0){
        int temp=max;
            max=min;
            min=temp;
        }
            max=Math.max(nums[i], max*nums[i]);
            min=Math.min(nums[i], min*nums[i]);
            result=Math.max(result,max);
        }return result;

14.  Average of two missing
int n=nums.length, sum=0;
        for (int x : nums) sum+=x;
        return ((n+2)*(n+3)/2-sum)/2.0;

15.silding window sum
List<Integer> res = new ArrayList<>();
int sum = 0;

for (int i = 0; i < nums.size(); i++) {
sum += nums.get(i);

if (i >= k) sum -= nums.get(i - k);

if (i >= k - 1) res.add(sum);
}
return res;

16. silding window average
List<Double> res = new ArrayList<>();
double sum = 0;
for (int i = 0; i < nums.size(); i++) {
sum += nums.get(i);
if (i >= k) sum -= nums.get(i - k);
if (i >= k - 1) res.add(sum / k);
}
return res;

17. unique word freq 
Map<String , Integer> freq=new HashMap<>();
        for (String word : words){
        freq.put(word, freq.getOrDefault(word,0)+1);
        }return freq;

18. Frequency sorted	`
 Map<String , Integer> freq = new HashMap<>();
        for (String word : words){
        freq.put(word,freq.getOrDefault(word,0)+1);
            
        }
        List<String> result = new ArrayList<>(freq.keySet());
         result.sort((a,b) -> freq.get(b)-freq.get(a));
        return result;



19. Most frequent word 
Map<String, Integer> freq = new HashMap<>();
        String mostFreq="";
        int maxCount=0;
        for (String word : words){
        freq.put(word,freq.getOrDefault(word,0)+1);
            if (freq.get(word)>maxCount){
            maxCount = freq.get(word);
                mostFreq=word;
            }
         }return mostFreq;

20. Find the Top K Frequent
Map<Integer , Integer> freq = new HashMap<>();
        for (int word : nums){
        freq.put(word,freq.getOrDefault(word,0)+1);
        }
        List<Integer> result = new ArrayList<>(freq.keySet());
         result.sort((a,b) -> freq.get(b)-freq.get(a));
        return result.subList(0,k);

21. reverse Integer
int s=0;
        while (x!=0){
        int next = s*10 + x%10;
            if (next/10!=s) return 0;
            s=next;
            x/=10;
        }return s;

22. Find the First Non Repeating Character
            for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
23. Longest Common Prefix
             if (strs.length == 0) return "";
             String res = strs[0];
             for (String s : strs)
                 while (!s.startsWith(res))
                     res = res.substring(0, res.length() - 1);
             return res;

24. Reversed Words in a String
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

25. Group Anagrams
        Map<String, List<String>> res = new HashMap<>();
        for (String s : words) {
            char[] t = s.toCharArray();
            Arrays.sort(t);
            String k = String.valueOf(t);
            res.putIfAbsent(k, new ArrayList<>());
            res.get(k).add(s);
        }
        return new ArrayList<>(res.values());

26. Move All Zeros to the End of a List
        List<Integer> res = new ArrayList<>();
        int zeros = 0;
        for (Integer num : list) {
            if (num != 0) res.add(num);
            else zeros++;
        }
		while (zeros-- > 0) {
            res.add(0);
        }
        return res;



27.Remove Duplicates and Move Zeros
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int count = 0;
        for (int x : list) {
            if (x == 0) {
                count++;
            } else if (seen.add(x)) {
                res.add(x);
            }
        }
        for (int i = 0; i < count; i++) res.add(0);
        return res;

28. silding Window max
List<Integer> res = new ArrayList<>();        
        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            res.add(max);
        }      
        return res;

29. find two missing number
 List<Integer> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);
        for (int i = 1; i <= nums.length + 2; i++) {
            if (!list.contains(i)) res.add(i);
        }
        return res;
