class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int[] c = new int[A.length];
        Set<Integer> mapA = new HashSet<>();
        Set<Integer> mapB = new HashSet<>();
        int count = 0;

        for(int i=0;i<A.length;i++)
        {
            if(mapA.contains(B[i])) {count++;}
            if (mapB.contains(A[i])) {count++;}
            if(A[i] == B[i]){count++;}
            mapA.add(A[i]);
            mapB.add(B[i]);
            c[i]=count;
        }
        return c;
    }
}