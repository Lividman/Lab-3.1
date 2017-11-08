import java.util.Arrays;
public class Lab3
{
	public static void main(String[] args)
	{
		
		int[] input1 = {16,2,3,6,7,6,8,9,10,2,9,10,11,10,12,12,16};
		int[] output= removeD(input1);
		for(int i:output){
            System.out.print(i+" ");
		}
		
	}
	public static int[] removeD(int[] list)
	{
		//arrays.sort does not return anything, it just sorts the array without removing any numbers
		Arrays.sort(list);
		int j = 0;
        int i = 1;
        if(list.length < 2){
            return list;
        }
        while(i < list.length){
            if(list[i] == list[j]){
                i++;
            }else{
                list[++j] = list[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = list[k];
        }
         
        return output;
    }
	
	public static int[][] productArray(int[]arr1, int[] arr2)
	{
		if(arr1.length != arr2.length)
		
	}
	public static int[][] pascalTriangle(int n)
	{
		
	}
	public static void printPascalTriangle(int[][] ptriangle)
	{
		
	}
}
