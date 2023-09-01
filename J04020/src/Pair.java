public class Pair<F, S> {
    private F first;
    private S second;
    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }
    public Boolean Prime(int x){
        if(x < 2) return false;
        if(x == 2 || x == 3)return true;
        if(x % 2 == 0 || x % 3 == 0)return false;
        for(int i = 5; i * i <= x; i += 6){
            if(x % i == 0 || x % (i + 2) == 0)return false;
        }
        return true;
    }
    public Boolean isPrime(){
        if(first instanceof Integer &&  second instanceof Integer)if(Prime((Integer)first) && Prime((Integer)second))return true;
        return false;
    }
    @Override
    public String toString(){
        return first + " " + second;
    }
}
