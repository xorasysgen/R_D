package code.test;

class MySuper {
    int x = 2;
    static int s = 3;
    MySuper() {
        x += 4;
    }
    MySuper(int x) {
        this();
        x += x + 20;
    }
    public MySuper method(){
        x += 35;
        return new MyClass();
    }
}
public class MyClass extends MySuper {
    public MyClass() {
        super(3);
        x -= 7;
        s += x;
    }
    public MySuper method(){
        x += 7;
        return super.method();
    }
    public static void main(String[] args){
        MyClass mc = new MyClass();
        mc.method();
        System.out.println(s);
    }
}