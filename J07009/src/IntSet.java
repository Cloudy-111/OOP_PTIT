
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class IntSet {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int size;
    public IntSet(int[] a){
        Set<Integer> s = new TreeSet<>();
        for(Integer i : a)s.add(i);
        for(Integer i : s)this.arr.add(i);
        this.size = s.size();
    }
    public int getSize(){
        return this.size;
    }
    public ArrayList getArray(){
        return this.arr;
    }
    public IntSet intersection(IntSet s2) {
        Set<Integer> st = new TreeSet<>(s2.getArray());
        Set<Integer> res = new TreeSet<>();
        for(Integer i : st)if(this.arr.contains(i))res.add(i);
        Integer[] ans = res.toArray(new Integer[res.size()]);//Tạo mảng mới với các phần tử trong Set
        return new IntSet(Arrays.stream(ans).mapToInt(Integer::intValue).toArray());//Chuyển mảng Integer sang mang int
    }
    @Override
    public String toString(){
        String res = "";
        for(Integer i : arr)res += i + " ";
        return res;
    }
}
