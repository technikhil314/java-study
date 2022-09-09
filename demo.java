class Demo {
    String name;
    private Demo(String name) {
        this.name = name;
    }
    public void method1(){
        System.out.println(this.name);   
    }
    public static void method2() {
        System.out.println();
        Demo d = new Demo("Darshana");
        d.method1();
        // System.out.println(this.name);
    }
    public static void main(String args[]) {
        // for(int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);
        Demo d = new Demo("Nikhil");
        d.method1();
        d.method2();
    }
}

class Demo1 {
public static void main1() {
        Demo.method2();
    }    
}