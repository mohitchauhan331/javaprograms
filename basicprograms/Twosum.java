package basicprograms;
public class Twosum {
    public int [] twosum( int []nums, int target) 
    {
        for(int i = 0 ; i < nums.length-1 ; i++)
        {
            for(int j = i+1; j < nums.length; j++ )
            {
                if (nums[i] + nums[j] == target)  
                {
                    return new int []{i,j};
                }
            }
        }
        return new int [0];
    }

public static void main (String[]args)
{
    Twosum twosum = new Twosum();
    int [] nums = { 7,3,2};
    int target = 9;
    int [] result = twosum.twosum(nums,target);
    System.out.println ("Output is :["+result [0] + "," + result [1] + "]");
}
}