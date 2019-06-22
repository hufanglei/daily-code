package com.hfl.writeableSort2;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.compress.BZip2Codec;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import java.io.IOException;

public class MainWritable {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        args = new String[]{"F:\\input\\GroupingComparator.txt", "F:\\output\\GroupingComparatorcompress"};
        //获取配置文件
        Configuration conf = new Configuration();
        //创建job任务
        Job job = Job.getInstance(conf);
        job.setJarByClass(MainWritable.class);
        //开启map端的输出压缩
        conf.setBoolean("mapreduce.map.output.compress", true);
        //设置压缩方式
        //conf.setClass("mapreduce.map.output.compress.codec", DefaultCodec.c lass, CompressionCodec.class);
        conf.setClass("mapreduce.map.output.compress.codec", BZip2Codec.class, CompressionCodec.class);

        //指定Map类和map的输出类型 Text, NullWritable
        job.setMapperClass(SortMap.class);
        job.setMapOutputKeyClass(FlowBean.class);
        job.setMapOutputValueClass(NullWritable.class);

        job.setReducerClass(SortReduce.class);
        job.setOutputKeyClass(FlowBean.class);
        job.setOutputValueClass(NullWritable.class);

        //指定数据输入的路径和输出的路径
        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        //设置reduce压缩
        FileOutputFormat.setCompressOutput(job,true);
        //设置压缩格式
        FileOutputFormat.setOutputCompressorClass(job,BZip2Codec.class);


        job.waitForCompletion(true);
    }

}
