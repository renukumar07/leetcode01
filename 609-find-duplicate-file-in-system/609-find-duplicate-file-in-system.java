class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<paths.length;i++){
            String[] values = paths[i].split(" ");
            String dir = values[0];
            for(int j = 1;j<values.length;j++){
                String[] file = values[j].split("\\(");
                String fileName = file[0];
                file[1] = file[1].replace(")","");
                String fileContent = file[1];
                List<String> list = map.getOrDefault(file[1], new ArrayList<String>());
                list.add(dir+"/"+fileName);
                map.put(fileContent, list);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key).size()>1){
                ans.add(map.get(key));
            }
        }
        return ans;
    }
}