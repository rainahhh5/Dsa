public class SearchinStrings {
    public static void main(String[] args) {
        String str= "satvikraina";
        char target = 'o';
        System.out.println(search(str,target));
    }
    static boolean search(String str,char target){
        if(str.isEmpty()){
            return false;
        }
        for(int index = 0; index < str.length(); index++) {
            if(target==str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
//searching in range//////