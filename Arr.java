//array
class Arr
{
public static void main(String [] arg)
{
int[] arr={8,9,1,2,4,5};
System.out.println("the  length of array is : " +arr.length);
System.out.println("the  index of array is : " +arr[1]);
System.out.println("the  length of array is : " +arr[arr.length-1]);

//sum of array
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];


}

System.out.println("the sum of array: "+sum);
}
}