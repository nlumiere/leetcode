class Solution {
    public int minOperations(String[] logs) {
        int level = 0;
        for(String s : logs){
            if(s.equals("../")){
                level--;
                if(level < 0){
                    level = 0;
                }
            }
            else if(s.equals("./")){
            }
            else{
                level++;
            }
        }
        return level;
    }
}