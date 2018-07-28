/**
 * @author lyj
 * @date 2018/7/25 - 18:07
 */
public class Main2 {

    public static void main(String[] args) {

        ArrayPlusPlus<Integer> arr=new ArrayPlusPlus<>();
        for (int i=0;i<10;i++){
            arr.addList(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);

        System.out.println("跟新第二处");


    }
}
