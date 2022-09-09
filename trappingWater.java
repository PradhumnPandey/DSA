class trapingWater {
    public static void main(String[] args) {
        System.out.print(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

    }
    public static  int trap(int[] height) {
        int res=0;
        for(int i=1;i<height.length-1;i++){
            res+=min(max(height,0,i),max(height,i,height.length-1))-height[i];
        }
        return res;
    }
    public static int max(int[] arr,int i,int n)
    {
        int max=0;
        while(i<=n){
            if(arr[i]>max) max=arr[i];
            i++;
        }
        return max;
    }
    public static int min(int a,int b){
        if(a>b) return b;
        return a;        }
    
}
