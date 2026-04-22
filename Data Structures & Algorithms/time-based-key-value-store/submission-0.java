class MapValue{
    private String value;
    private int timestamp;

    public MapValue(String value, int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }

    public int getTimestamp(){
        return this.timestamp;
    }
    public String getValue(){
        return this.value;
    }
}
class TimeMap {

    HashMap<String, ArrayList<MapValue>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!this.map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        ArrayList<MapValue> a = this.map.get(key);
        a.add(new MapValue(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if(!this.map.containsKey(key))
            return "";
        else{
            ArrayList<MapValue> m = this.map.get(key);
            String v= findTheElement(m, timestamp);
            return v;
        }
    }

    private String findTheElement(ArrayList<MapValue> m, int timestamp) {
        int l = 0;
        int h = m.size()-1;
        int matchIndex = -1;
        while (l<=h){
            int mid = (l+h)/2;
            if(m.get(mid).getTimestamp() == timestamp){
                return m.get(mid).getValue();
            }
            else if(m.get(mid).getTimestamp()<=timestamp){
                matchIndex = mid;
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        if(matchIndex == -1) {
            return "";
        }
        return m.get(matchIndex).getValue();
    }
}
