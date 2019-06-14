package com.hfl.work;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class ClassPartion extends Partitioner<Text, Text> {

    @Override
    public int getPartition(Text text, Text value, int i) {
        //拿到每行数据
        String t = text.toString();
        System.out.println(t);
        //得到每个单词的长度
        int num = 1;
        t = t.trim();
        System.out.println(t.equals("001"));
        System.out.println(t.equals("002"));
        System.out.println(t.equals("003"));
        if (t.equals("001")) {
            num =  0;
        } else if (t.equals("002")){
            num =  1;
        } else if(t.equals("003")){
            num =  2;
        }
        return num;
    }
}
