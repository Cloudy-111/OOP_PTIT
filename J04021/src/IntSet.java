
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class IntSet {
    private ArrayList<Integer> array = new ArrayList<>();
    private int size;

    public IntSet(int[] a){
        Set<Integer> ts = new TreeSet<>();
        for(int i = 0; i < a.length; ++i)ts.add(a[i]);
        for(Integer i : ts)this.array.add(i);
        this.size = ts.size();
    }
    public int getIntsetSize(){
        return size;
    }
    public ArrayList getArray(){
        return array;
    }
    public IntSet union(IntSet b){
        Set<Integer> ts = new TreeSet<>(b.getArray());
        for(Integer i : this.array)ts.add(i);
        Integer[] res = ts.toArray(new Integer[ts.size()]);//tạo mảng có độ dài bằng treeset
        return new IntSet(Arrays.stream(res).mapToInt(Integer::intValue).toArray());//chuyển mảng Integer sang mảng int
        //có thể chuyển từng phần tử của mảng Integer sang mảng int qua int_array[i] = Integer_array[i]
    }
    @Override
    public String toString(){
        String res = "";
        for(int i : array)res += i + " ";
        return res;
    }
}
