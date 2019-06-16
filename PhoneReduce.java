package com.hfl.phone;


import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class PhoneReduce extends Reducer<Text, NullWritable,Text, NullWritable> {

    //拿到分区数据直接输出就好了
    //这里有个问题：日志清洗那块 reduce可以不写，这里写了，因为分区了。
    @Override
    protected void reduce(Text key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {
        context.write(key, NullWritable.get());
    }
}
