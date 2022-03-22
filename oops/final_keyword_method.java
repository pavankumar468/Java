public class final_keyword_method {
    final void run(){System.out.println("happy");}
    
    class honda extends final_keyword_method{
        void run(){System.out.println("not happy");}
    }
    public static void main(String[] args) {
        honda obj = new honda();
        obj.run();
    }
}
