import java.util.ArrayList;

class UnionOfTwoSortedArrays{
    static ArrayList<Integer> union(int[] a, int[] b) {

        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (i < a.length && j < b.length) {

            // Skip duplicates in a
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in b
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                res.add(a[i++]);
            } else if (a[i] > b[j]) {
                res.add(b[j++]);
            } else {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        // Remaining elements
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1])
                res.add(a[i]);
            i++;
        }

        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1])
                res.add(b[j]);
            j++;
        }

        return res;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,4,5,6};
        ArrayList<Integer> result=union(a,b);
        for(int x:result){
            System.out.print(x+" ");
        }

    }
}


