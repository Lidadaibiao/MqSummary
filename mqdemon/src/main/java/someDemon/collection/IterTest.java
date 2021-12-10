package someDemon.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/12/2 15:05
 */
public class IterTest {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i+"collection");
        }
        System.out.println(collection);
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
           iterator.next();   //不使用next迭代，会出现IllegalStateException
            iterator.remove();
        }
    }

}
