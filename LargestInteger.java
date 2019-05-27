 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] i){
        int x = 0;
        if (i[0]>i[1]){
              x = i[0];
        }else{
              x = i[1];
        }
        if (i[2] > x){
              x = i[2];
        }
        
        return x;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] i){
        return Math.max(i[0],Math.max(i[1],i[2]));
    }
}
