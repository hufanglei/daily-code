package com.hfl.phone;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;
import java.util.Arrays;

public class PhonePartition extends Partitioner<Text, NullWritable> {
    //定义移动的规则
    public static final String[] YD = {
            "134","135","136",
            "137","138","139",
            "150","151","152",
            "157","158","159",
            "188","187","182",
            "183","184","178",
            "147","172","198",
    };
    //定义电信的规则
    public static final String[] DX = {
            "133","149","153",
            "173","177","180",
            "181","189","199"};
    //定义联通的规则
    public static final String[] LT = {
            "130","131","132",
            "145","155","156",
            "166","171","175",
            "176","185","186","166"
    };
    @Override
    public int getPartition(Text text, NullWritable nullWritable, int i) {
        //截取前3位
        String phone = text.toString();
        String num = phone.substring(0, 3);
        //3个数组集合，如果集合中包含手机号则返回一个值
        if(Arrays.asList(YD).contains(num)){
            return 0;   //分区从0开始
        }else if(Arrays.asList(DX).contains(num)){
            return 1;
        }else if(Arrays.asList(LT).contains(num)){
            return 2;
        }
        return 3;
    }
    
}
