package leetcode;

/**
 * Created by slyuan on 17-4-18.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue {
    public static boolean ASC = true;
    public static boolean DESC = false;

    public static void main(String[] args) {

        // Creating dummy unsorted map
        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        unsortMap.put("acb", 55);
        unsortMap.put("ach", 80);
        unsortMap.put("bac", 20);
        unsortMap.put("ccc", 70);
        unsortMap.put("acs", 90);

        System.out.println("Before sorting......");
        printMap(unsortMap);

//        System.out.println("After sorting ascending order......");
//        Map<String, Integer> sortedMapAsc = sortByComparator(unsortMap, ASC);
//        printMap(sortedMapAsc);
//
//
//        System.out.println("After sorting descindeng order......");
//        Map<String, Integer> sortedMapDesc = sortByComparator(unsortMap, DESC);
//        printMap(sortedMapDesc);

        //注意：正常情况下Map是不可以使用Collections.sort()方法进行排序的，不过可以将Map转换成list之后再进行排序。
        List<Entry<String,Integer>> list = new LinkedList<>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getKey().compareTo(e2.getKey());
            }
        });

        System.out.println();
        for (Entry<String, Integer> entry : list) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }


    }

    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order) {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
    }

    //通用
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ) {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>( map.entrySet() );
        Collections.sort( list, new Comparator<Map.Entry<K, V>>() {
            public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 ) {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put( entry.getKey(), entry.getValue() );
        }
        return result;
    }

}