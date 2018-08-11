import java.util.Arrays;
import java.util.List;

class HomeWork{
    public static void main(String[] args) {
    }
}
class txt{
    Object[] arr;
    int x;
    int y;
    public txt() {

        Object xy  = arr[x];
        arr[x] = arr[y];
        arr[y] = xy;
    }
    public void info(){
        System.out.println(arr[y]);
    }
}
class As<T>{

    private static java.util.Arrays  Arrays;

    T obj;

    public As convert(T[] obj) {

        return new As(Arrays.asList(obj));
    }
    public As(List<T> asList) {
    }
}