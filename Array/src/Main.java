/**
 * @author lyj
 * @date 2018/7/25 - 16:11
 */
public class Main {

    public static void main(String[] args) {

        ArrayPlus<Integer> arr=new ArrayPlus<>(20);

        for (int i = 0; i < 10; i++) {
            arr.addList(i);
        }

        System.out.println(arr);

      arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        int remove = arr.remove(2);
        System.out.println(remove);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);

        arr.removeElement(5);
        System.out.println(arr);


    }

}
