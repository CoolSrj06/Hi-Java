/*
These are notes for general knowledge, one can directly skip to code if he wants

HashMap is implemented as a Array of Linked List
Search values in O(1) time complexity
It stores values in Key-Value format
Key     value
kunal   88
karan   99
rahul   95

Ex: map.get("kunal") => 88
Concepts:
Hashcode

Collision:
    resolving method:
        chaining: less sensitive to hash function
        open hashing: better cache performance

Hash-function:
chaining:
    division method: h(K)=K%m
    multiplication method: [(a.k)%2^w]>>(w-r)
        a=random number(a is odd & 2^w-1<a<2^w and is not close to 2^w-1 and 2^w)
        w=no of bit in k
        m=2^r
    universal hashing:
        h(k)=[(ak+b)%p]%m
        a and b are random and element of [0,1,....,p-1]
        and p is very large number

Probing strategies:
    linear probing:
        h(k,i)=(h(k)+i)%m
    double hashing:
        h(k,i)=(h1(k)+i*h2(k))%m

Uniform hashing function
    Every key is equally like to have m! permutation

Size of table:
    m=theta(n)
    if too small:slow
    too big:wasting resources

    Idea: start small and grow

    start small and when table gets filled double the size
    when you double the table, cost to insert n items =O(N)
    insert 1 item : O(1)--> amortized constant time(on an average constant time

 */


/* Majority Element
given an array of size n, find all the elements that appear more than n/3 times
 */
import java.util.HashMap;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        int[] arr={1,3,5,1,2,3,5,1,1,3,3}; // initialized an array
        HashMap<Integer,Integer> map=new HashMap<>(); // created and hashmap of int,int key value pair
        insert(arr,map); //inserted values in map, no return type as value is pass by value
        Set<Integer> key=map.keySet(); //
        for (int val:key){
            if (map.get(val)>arr.length/3)
                System.out.println(val);
        }
    }
    public static void insert(int[] arr, HashMap<Integer,Integer> map){

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
    }

}


