package DubboDemo;

/**
 * @author: Mr.Wang
 * @create: 2018-09-20
 **/
public class ClassLoaderWrapper {
    ClassLoader defaultClassLoader;
    ClassLoader systemClassLoader;
    ClassLoaderWrapper(){
        systemClassLoader=ClassLoader.getSystemClassLoader();
    }
}
