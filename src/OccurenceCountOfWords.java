import java.util.*;

public class OccurenceCountOfWords {

    public static void main(String[]args){

        String text = "Hello students. Please welcome these two new students in class. Welcome new students. Please feel welcome ";

        HashMap<String, Integer> hashMap= new HashMap<String, Integer>();
        StringTokenizer st = new StringTokenizer(text, " ");

        while (st.hasMoreTokens()){

            String key = st.nextToken();
            if (hashMap.get(key) != null){

                int value = ((Integer)hashMap.get(key).intValue());
                value++;
                hashMap.put(key, new Integer(value));


            }
            else{
                hashMap.put(key, new Integer(1));
            }
        }

        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);

        Set entrySet = treeMap.entrySet();

        Iterator iterator = entrySet.iterator();
        ArrayList<WordOccurence> list = new ArrayList<WordOccurence>();

        while (iterator.hasNext()){

            StringTokenizer st1 = new StringTokenizer(iterator.next().toString(), "=");

            list.add(new WordOccurence(st1.nextToken(), Integer.parseInt(st1.nextToken())));
        }

        Collections.sort(list);
        System.out.println("Words in ascending order of occurences: ");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
