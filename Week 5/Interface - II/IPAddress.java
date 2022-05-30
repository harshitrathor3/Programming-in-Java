public class IPAddress implements Comparable{
    private int[] n;

    
    public int compareTo(Object o) {
        IPAddress other = (IPAddress)0;
        int result = 0;

        for (int i=0; i<n.length; i++){
            if (this.getNum(i)<other.getNum(i)){
                result = -1;
                break;
            }
            if (this.getNum(i)>other.getNum(i)){
                result = 1;
                break;
            }

        }
        return result;
    }

    
}
