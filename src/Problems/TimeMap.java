package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeMap {
    HashMap<String, ValueTimeStampList> hashMap;

    /** Initialize your data structure here. */
    public TimeMap() {
        hashMap = new HashMap<String, ValueTimeStampList>();
    }
    
    public void set(String key, String value, int timestamp) {
        ValueTimeStampList valueTimeStampList = hashMap.get(key);
        if (valueTimeStampList == null) {
            valueTimeStampList = new ValueTimeStampList();
        }

        valueTimeStampList.list.add(new ValueTimeStamp(value, timestamp));
        valueTimeStampList.list = valueTimeStampList.list.sort();
        hashMap.put(key, valueTimeStampList);
    }
    
    public String get(String key, int timestamp) {
        ValueTimeStampList valueTimeStampList = hashMap.get(key);
        valueTimeStampList.list.
    }

    public class ValueTimeStamp {
        public String value;
        public int timestamp;

        public ValueTimeStamp(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    public class ValueTimeStampList {
        public List<ValueTimeStamp> list;
        public ValueTimeStampList() {
            this.list = new ArrayList();
        }
    }
}
