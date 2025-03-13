class staticdemo{

    static int a = 42;
    static int b = 99;
    static void callme(){
        System.out.println("a = " + a);
    }



}
class staticByname{
    public static void main(String[] args) {
        staticdemo.callme();
        System.out.println("b = " + staticdemo.b);
    

    }

}
