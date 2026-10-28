class Solution {
    public List<List<Integer>> permute(int[] nums) {
//         int n=nums.length;
//         int c=1;
//         while(c<n){
//             for(int i=1;i<n;i++){
//                 if(i==)
//                 nums[n-1]=nums[0];
//                 nums[i-1]=nums[i];
//             }
//         }
//     }
// }
int n=nums.length;
List<Integer> ds=new ArrayList<>();
List<List<Integer>> ans=new ArrayList<>();
boolean freq[]=new boolean[n];
permutation(nums,ans,ds,freq);
return ans;
    }
private void permutation(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
    int n=nums.length;
    if(ds.size()==n){
    ans.add(new ArrayList<>(ds));
    return;
    }
    for(int i=0;i<n;i++){
        if(!freq[i]){
        freq[i]=true;
        ds.add(nums[i]);
        permutation(nums,ans,ds,freq);
        ds.remove(ds.size()-1);
        freq[i]=false;
            }
    }
}
}