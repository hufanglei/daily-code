package com.hfl.phone;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class PhoneMap extends Mapper<LongWritable, Text, Text, NullWritable>  {

    //将每行数据按照空格进行切分，然后遍历数据，写出去
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] split = line.split("\t");
        for (String s: split){
            context.write(new Text(s), NullWritable.get());
        }
    }

}
