package com.hfl.work;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class ClassMap extends Mapper<LongWritable, Text, Text, Text> {


    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //读取每一行  小明 001 null
        String lineStr = value.toString();
        System.out.println(lineStr);
        String[] split = lineStr.split(" ");
        System.out.println(split.toString());
        if(split.length>1){
            context.write(new Text(split[1].trim()),new Text(split[0].trim()));
        }
    }
}
