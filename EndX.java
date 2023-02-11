public class EndX {
    public static void printX(String str, int idx, String newstring, int count){
        if(idx == str.length()-1){
            for(int i=0;i<count;i++){
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        char curr_ele = str.charAt(idx);
        if(curr_ele == 'x'){
            count++;
            printX(str, idx+1, newstring, count);

        }
        else{
            newstring += curr_ele;
            printX(str, idx+1, newstring, count);

        }
    }
    public static void main(String[] args) {
        String str = "axbxcxxd";
        printX(str, 0, "", 0);

    }
    
}
