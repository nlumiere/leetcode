import java.util.Stack;
import java.lang.StringBuffer;

class Solution_Stack{
    public String reverseWords(String s){
        Stack<String> words = new Stack<String>();
        String build = "";
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == ' '){
                if(build.length() >= 1){
                    words.push(build);
                    build = "";
                }
            }
            else{
                build += x;
            }
        }
        if(build.length() >= 1){
            words.push(build);
            build = "";
        }

        StringBuffer ship = new StringBuffer();
        int size = words.size();
        for(int i = 0; i < size; i++){
            ship.append(words.pop() + ' ');
        }
        if(ship.length() > 1){
            ship.setLength(ship.length()-1);
        }
        return ship.toString();
    }
}