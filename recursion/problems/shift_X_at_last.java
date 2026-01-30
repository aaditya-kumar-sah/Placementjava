package problems;
public class shift_X_at_last{
    public static void MoveX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i ++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count += 1;
            MoveX(str, idx + 1, count, newString);
        }
        else{
            newString += currChar;
            MoveX(str, idx + 1, count, newString);
        }
    }
    public static void main(String args[]){
        String str = "axbcxxd";
        MoveX(str, 0, 0, "");
    }
}