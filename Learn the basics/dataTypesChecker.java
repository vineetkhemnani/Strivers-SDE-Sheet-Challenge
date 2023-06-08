class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character")==true){
            return 1;
        }
        else if(str.equals("Integer")){
            return 4;
        } else if(str.equals("Float")){
            return 4;
        } else if(str.equals("Long")){
            return 8;
        } else if(str.equals("Double")){
            return 8;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(dataTypeSize("Integer"));
    }
}