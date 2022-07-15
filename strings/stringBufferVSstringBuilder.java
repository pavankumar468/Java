/*String buffer and string builder are used to create mutable string objects; but string create immutable string objects.
 * -> string buffer is synchronised i.e thread safe,it means multiple threads cannot call methods simultaneously && less speed, efficient.
 * -> string buffer is non synchronised i.e not thread safe,it means multiple threads can call methods simultaneously && more speed, efficient. 
 */
public class stringBufferVSstringBuilder {
    public static void main(String[] args) {
        System.out.println("string buffer");
        StringBuffer buff = new StringBuffer("Hello");
        System.out.println(buff);
        System.out.println("append() is used to concatenate 2 strings");
        buff.append(" world");
        System.out.println(buff);
        System.out.println(" insert() is used to insert a string at index position");
        buff.insert(1,"java");
        System.out.println(buff);
        System.out.println(" replace() is used to replace a string with another string at index position");
        buff.replace(1, 4, "pava");
        System.out.println(buff);
        System.out.println("delete()used to remove index character from string");
        buff.delete(1,4);
        System.out.println("reverse( used to reverse a string");
        buff.reverse();

        System.out.println("string builder");
        StringBuilder build = new StringBuilder("pavan");
        System.out.println(build);
        build.append("kumar");
        System.out.println(build);
        build.insert(3, "ubs");
        System.out.println(build);
        build.replace(3,6, "win");
        System.out.println(build);
        build.delete(3, 6);
        System.out.println(build);
        build.reverse();
        System.out.println(build);
        System.out.println(build.capacity());

        System.out.println(" Performance test of string buffer vs string builder");
        long startTime = System.currentTimeMillis();
        StringBuffer buf = new StringBuffer("java");
        for (int i = 0; i < 10000; i++) {
            buf.append("Tpoint");            
        }
        System.out.println("Time taken by string buffer"+(System.currentTimeMillis() - startTime)+"ms");

        startTime = System.currentTimeMillis();
        StringBuilder bui = new StringBuilder("java");
        for (int i = 0; i < 10000; i++) {
           bui.append("pavan");
        }
        System.out.println("Time taken by string builder"+(System.currentTimeMillis()-startTime)+"ms");


    }
}
