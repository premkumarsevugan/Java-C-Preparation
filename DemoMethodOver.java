public class DemoMethodOver {
    void over(){
        System.out.println("without para");
    }
    void over(int a){
        System.out.println(a);
    }
    public static void main(String args[]){
        DemoMethodOver a=new DemoMethodOver();
        a.over();
        a.over(20);
    }
}
