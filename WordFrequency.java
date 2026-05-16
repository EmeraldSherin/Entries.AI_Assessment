import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] word=s.split(" ");
        Map<String,Integer> name=new HashMap<>();
        Integer count=0;
        for(int i=0;i<word.length;i++ ){
            for(int j=0;j<word.length;j++){
                if(word[i]==word[j]){
                    count++;
                }name.put(word[i],count);
            }

        }
    }
}
