package appMonitor.Utils;

import java.util.*;

public class test {
    public static void main(String[] args){
       /* Date date = new Date();//获取当前日期时间
        System.err.println(date);//打印当前日期时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//创建一个日期格式.
        String now = format.format(date);//以格式处理date
        System.err.println(now);//打印处理的结果
        date = null;//清空date对象
        try {
            date = format.parse(now);//按格式逆转化now
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.err.println(date);//打印逆转化后生成的date*/
        List<String> list = new ArrayList<String>();
        list.add("200");
        list.add("200");
        list.add("3");
        list.add("3");
        Map<String,Integer> map = new HashMap<>();
        for (String string : list) {
            if(map.containsKey(string)) {
                map.put(string, map.get(string).intValue()+1);
            }else {
                map.put(string, new Integer(1));
            }
        }
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            System.out.println(key+"有"+map.get(key)+"个");
        }
    
    
    }
}
