import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] booleans = new boolean[p.length];
        for(int i = 0;i < p.length;i++){
            if(s.contains(p[i])){
                booleans[i] = true;
            }else {
                booleans[i] = false;
            }
        }
        return booleans;
    }
    public boolean[] chkSubStr1(String[] p, int n, String s) {
        boolean[] booleans = new boolean[p.length];
        for(int i = 0;i<p.length;i++){
            booleans[i] = s.contains(p[i]);
        }
        return booleans;
    }
}