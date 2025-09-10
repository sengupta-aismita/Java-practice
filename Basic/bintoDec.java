
public class bintoDec {
    static void BinToDec(int binum){
        int mynum = binum;
        int pow = 0;
        int decNum = 0;
        while (binum>0){
            int last = binum % 10;
            decNum = decNum + (last* (int)Math.pow(2,pow));
            pow++;
            binum= binum/10;
        }
        System.out.println("decimal of " + mynum + "is : " + decNum);
    }
    public static void main(String[] args) {
        BinToDec(101);
    }
}
