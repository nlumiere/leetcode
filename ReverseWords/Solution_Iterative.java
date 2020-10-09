import java.lang.StringBuffer;
class Solution_Iterative{
    public String reverseWords(String s){
        StringBuffer reverser = new StringBuffer();
        StringBuffer ship = new StringBuffer();
        for(int i = s.length()-1; i >= 0; i--){
            char x = s.charAt(i);
            if(x == ' '){
                if(reverser.length() >= 1){
                    ship.append(reverser.reverse());
                    ship.append(' ');
                    reverser.delete(0, reverser.length());
                }
            }
            else{
                reverser.append(x);
            }
        }
        if(reverser.length() >= 1){
            ship.append(reverser.reverse());
        }

        if(ship.charAt(ship.length()-1) == ' '){
            ship.deleteCharAt(ship.length() -1);
        }
        return ship.toString();
    }
}