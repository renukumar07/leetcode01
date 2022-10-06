class TimeMap {

    Map<String, Map<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new HashMap<>());
        }
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        for(int currTime = timestamp; currTime>=1;currTime--){
            if(map.get(key).containsKey(currTime)){
                return map.get(key).get(currTime);
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */