import java.util.*;
class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      List<String> r = permutation(str);
      Collections.sort(r);
      for(String a : r){
        System.out.println(a);
      }
    }
  public static ArrayList<String> permutation(String s) {
    ArrayList<String> res = new ArrayList<String>();
    if (s.length() == 1) {
        res.add(s);
    } else if (s.length() > 1) {
        int lastIndex = s.length() - 1;
        String last = s.substring(lastIndex);
        String rest = s.substring(0, lastIndex);
        res = merge(permutation(rest), last);
    }
    return res;
}
public static ArrayList<String> merge(ArrayList<String> list, String c) {
    ArrayList<String> res = new ArrayList<>();
    for (String s : list) {
        for (int i = 0; i <= s.length(); ++i) {
            String ps = new StringBuffer(s).insert(i, c).toString();
            res.add(ps);
        }
    }
    return res;
}
}