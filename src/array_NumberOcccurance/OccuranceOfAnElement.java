package array_NumberOcccurance;

public class OccuranceOfAnElement {
    public static void main(String[] args) {
        int [] nums={1,5,3,6,7,6,3,4,1,3,9};
        int [] arr=new int[nums.length];
        int visited=-1;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    arr[j]=visited;
                }
            }
            if(arr[i]!=visited){
                arr[i]=count;
            }
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]!=visited){
            System.out.println(nums[i]+"====>"+arr[i]);
        }
        }
    }
}
