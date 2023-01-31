package JavaKeywords;

public class Test1 {
    int arg=5;
//    void myTest(int arg) {
//        this.arg=arg;
//    }
    Test1() {
        System.out.println("Hi! I am default constructor");
    }
    Test1(int arg) {
        this();
        this.arg=arg;
    }
    public static void main(String[] args) {
        int arg=10;
//        Test1 obj=new Test1();
        Test1 obj=new Test1(10);

//        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
