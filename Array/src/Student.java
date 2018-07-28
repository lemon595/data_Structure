/**
 * @author lyj
 * @date 2018/7/25 - 17:57
 */
public class Student {

    private  String name;
    private  int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    public static void main(String[] args) {
        ArrayPlus<Student> arr=new ArrayPlus<>();
        arr.addList(new Student("alice",100));
        arr.addList(new Student("bob",55));
        arr.addList(new Student("charlie",77));

        System.out.println(arr);
    }

}
