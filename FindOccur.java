public class FindOccur {
    public static int first = -1;
    public static int last = -1;
    public static void FindOcc(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char curr_ele = str.charAt(idx);
        if(curr_ele == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        FindOcc(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "manav";
        FindOcc(str, 0, 'a');

    }
}
