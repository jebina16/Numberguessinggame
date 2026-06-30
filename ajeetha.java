class parent{
    void method1(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    void method2(){
        System.out.println("Child class");
    }
}
class child1 extends parent{
    void method3(){
        System.out.println("child1 class");
    }
}
class child2 extends child1{
    void method4(){
        System.out.println("Child2 class");
    }
}
public class ajeetha{
    public static void main(String[]args){
        child1 c=new child1();
        c.method1();
        c.method3();
        child o=new child();
        o.method1();
        o.method2();
        child2 u=new child2();
        u.method3();
        u.method4();
        u.method1();
    }
}