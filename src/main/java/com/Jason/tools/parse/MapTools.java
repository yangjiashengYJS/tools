package com.Jason.tools.parse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * map工具类
 * ========================
 * Created with IntelliJ IDEA.
 * User：Jason_Yang
 * Date：2017/6/8
 * Time：21:37
 *
 * ========================
 */
public class MapTools {
    /**
     * 将Iterable集合转换成ArrayList集合
     * @param iterable 源集合
     * @param <T> 类型
     * @return arrayList结果
     */
    public static <T> List<T> iteratorToList(Iterable<T> iterable)
    {
        List<T> returnList = new ArrayList<T>();
        Iterator<T> iterator = iterable.iterator();
        while(iterator.hasNext())
        {
            returnList.add(iterator.next());
        }
        return returnList;
    }
}
