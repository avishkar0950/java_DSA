import java.io.*;
import java.util.*;

public class Selection_sorting {
    public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
	}
  
    public static void main(String args[])
    {
        int arr[]={7,8,3,1,2};
        //selection sorting

        for(int i=0;i<arr.length;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
           // swapping
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
