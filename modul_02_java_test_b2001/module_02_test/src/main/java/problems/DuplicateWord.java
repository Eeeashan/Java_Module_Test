package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        findDuplicate(st);

    }
    public static void findDuplicate(String st){
       //split: counting the spaces
        String word[] = st.split(" ");
        //create one hashmap
        Map<String,Integer> wordCount = new HashMap<String, Integer>();
        //to check each word in given array
        for(String words: word){

            if (wordCount.containsKey(words)){
                wordCount.put(words,wordCount.get(words)+1);
            }else {
                wordCount.put(words, 1);
            }
        }
        //Extracting key from map - wordCount
        Set<String> wordsInString = wordCount.keySet();
        for(String words: wordsInString){
            if (wordCount.get(words)>1){
                System.out.println(words + " : "+ wordCount.get(words));
                System.out.println(words.length());

            }
        }
    }

    }


