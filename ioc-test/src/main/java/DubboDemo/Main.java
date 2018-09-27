package DubboDemo;

/**
 * @author: Mr.Wang
 * @create: 2018-09-20
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println(Resources.classLoaderWrapper);
        ClassLoaderWrapper classLoaderWrapper= new ClassLoaderWrapper();
        System.out.println(classLoaderWrapper);
    }
}
