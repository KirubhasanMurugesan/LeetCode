/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n)==0){
            return n;
        }

        int mid=0,start=0,end=n,ans=9;
        while(start<=end){
            mid=start+(end-start)/2;
            int k=guess(mid);
            if(k==0){
                return mid;
            }else if(k==-1){
                end=mid-1;
            }else if(k==1){
                start=mid+1;
            }
        }
        return n;
        
                
    }
}