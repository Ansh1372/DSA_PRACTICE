package Math;

public class leet2829 {
    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int minStep = Math.max(Math.abs(sx - fx), Math.abs(sy - fy));
        return minStep == 0 ? t != 1 : minStep <= t;
    }
    public static void main(String[] args) {
        System.out.println("true".equals(isReachableAtTime(3,5,-4,7,16)));
        System.out.println("false".equals(isReachableAtTime(-1,0,0,1,2)));
        System.out.println("true".equals(isReachableAtTime(1,1,1,3,5)));
        System.out.println("false".equals(isReachableAtTime(1,1,2,2,2)));
    }
}
