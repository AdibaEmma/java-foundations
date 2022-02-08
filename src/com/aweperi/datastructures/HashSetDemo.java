package com.aweperi.datastructures;

import java.util.HashSet;

//Que : You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if  a == c and b == d.
// That also implies (a,b) is not same as (b,a).
// You need to print number of unique pairs you currently have.
class Pair<T> {

    // Pair attributes
    public T firstValue;
    public T secondValue;

    public Pair(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
}
public class HashSetDemo {
    public static void main(String[] args) {
        Pair[] arrayPair = new Pair[4];
        arrayPair[0] = new Pair(2, 3);
        arrayPair[1] = new Pair(3, 4);
        arrayPair[2] = new Pair(5, 10);
        arrayPair[3] = new Pair(3, 4);

        System.out.println(getUniquePairCount(arrayPair));

        Pair[] arrayPair2 = new Pair[4];
        arrayPair2[0] = new Pair("John", "Alice");
        arrayPair2[1] = new Pair("Peter", "Ben");
        arrayPair2[2] = new Pair("Alice", "John");
        arrayPair2[3] = new Pair("Peter", "Mag");
        System.out.println(getUniquePairCount(arrayPair2));
    }

    public static int getUniquePairCount(Pair[] arrayPair) {
        HashSet<String> set = new HashSet<>();
        int totalPairCount = 0;
        for (Pair pair : arrayPair) {
            set.add(pair.firstValue + " " + pair.secondValue);
            totalPairCount = set.size();
        }
        return totalPairCount;
    }

}
