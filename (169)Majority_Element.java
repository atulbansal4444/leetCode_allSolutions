//169. Majority Element

class Solution {
    public Map<Integer,Integer> counts(int[]arr)
    {
       Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!(map.containsKey(arr[i])))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return map;
    }
    
    public int majorityElement(int[] nums) {
     
        Map<Integer, Integer> count = counts(nums);
        Map.Entry<Integer, Integer> max = null;
        for(Map.Entry<Integer,Integer> entry : count.entrySet())
        {
            if(max == null || entry.getValue() > max.getValue())
            {
                max=entry;
            }
        }
        return max.getKey();
    }
}