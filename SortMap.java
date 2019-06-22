package com.hfl.writeableSort2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

//0000001	Pdt_01	222.8
//mapreduce根据key进行排序，所以k2，v2的类型应该为 FlowBean, NullWritable
public class SortMap extends Mapper<LongWritable, Text, FlowBean, NullWritable> {
    FlowBean bean = new FlowBean();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String s = value.toString();
        String[] split = s.split("\t");
        bean.setId(Long.parseLong(split[0]));
        bean.setPrice(Double.parseDouble(split[2]));
        context.write(bean, NullWritable.get());
    }
}
