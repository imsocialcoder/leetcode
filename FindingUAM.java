class FindingUAM {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];
        HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
        int uid, min, size;
        for(int i=0; i<logs.length;i++){
            //uid = logs[i][0];
            //min = logs[i][1];
            if(map.get(logs[i][0]) != null){
                if(!map.get(logs[i][0]).contains(logs[i][1])){
                    map.get(logs[i][0]).add(logs[i][1]);
                    size = map.get(logs[i][0]).size();
                    result[size-1] = result[size-1] + 1;
                    result[size-2] = result[size-2] - 1;
                }else{
                    //do nothing.
                }
            }else{
                HashSet<Integer> list = new HashSet<Integer>();
                list.add(logs[i][1]);
                map.put(logs[i][0], list);
                result[0] = result[0] + 1;
            }
        }
        return result;
    }
}
