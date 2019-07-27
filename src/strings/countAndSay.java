package strings;

public class countAndSay {
    public static void main(String[] args) {
        System.out.println(new countAndSay().countAndSay(7));
    }

    public String countAndSay(int A) {
        if(A == 1) return Integer.toString(1);
        if(A == 2) return Integer.toString(11);
        if(A == 3) return Integer.toString(21);
        String ans = "21";
        int count;

        A = A-3;
        while(A > 0){
            count = 1;
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < ans.length(); i++){
                if((i+1) < ans.length() && ans.charAt(i) == ans.charAt(i+1)) count++;
                else{
                    sb.append(count);
                    sb.append(ans.charAt(i));
                    count = 1;
                }
            }
            ans = sb.toString();
           // System.out.println(ans);
            A--;
        }
        return ans;
    }
}
