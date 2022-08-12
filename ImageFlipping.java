import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class ImageFlipping {
    public static void main(String[] args){
       int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
       int[][] nimage=flipAndInvertImage(image);
       //to print 2d array
       for(int[] i:nimage){
        System.out.println(Arrays.toString(i));
       }
    //   System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] i:image){
           int start=0; 
            int end=(i.length)-1;
		    while(start<end) {
			flip(i,start,end);
			start++;
			end--;
            }
        }
        for(int[] i:image){
            invert(i);
        }
        return image;
    }
    static void flip(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
    static void invert(int[] arr) {
		for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
	}
}
