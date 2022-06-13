package March;

import java.util.*;
//T.C:O(N^2)
//S.C:O(1);
//problem link:https://leetcode.com/problems/triangle
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<triangle.get(i).size();j++){
                int sum=0;
                if(j==0){
                    sum=triangle.get(i-1).get(j)+triangle.get(i).get(j);
                }
                else if(j==triangle.get(i).size()-1){
                    sum=triangle.get(i).get(j)+triangle.get(i-1).get(triangle.get(i-1).size()-1);
                }
                else{
                    int min=Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1));
                    sum=triangle.get(i).get(j)+min;
                }
                triangle.get(i).set(j,sum);
            }
        }
        return Collections.min(triangle.get(triangle.size()-1));
    }
}
