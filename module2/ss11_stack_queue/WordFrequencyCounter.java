package ss11_stack_queue;

import java.util.*;

public class WordFrequencyCounter {
    public static void frequencyCount(String str) {
        str = str.toLowerCase();
        String[] strings = str.split("");
        TreeMap<String, Integer> frequencyMap = new TreeMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            if(frequencyMap.containsKey(strings[i])){
                frequencyMap.put(strings[i], frequencyMap.get(strings[i]) +1);
            }
            else{
                frequencyMap.put(strings[i], 1);
            }
        }
        frequencyMap.remove(" ");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì: ");
        String str = scanner.nextLine();
        frequencyCount(str);
    }
}
