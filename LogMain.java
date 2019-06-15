package com.hfl.log2;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class LogMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        long starttime = System.currentTimeMillis();
        args=new String[]{"F:\\input\\web.txt","F:\\output\\web2"};
        Configuration conf = new Configuration();

        //创建job任务
        Job job = Job.getInstance(conf);
        job.setJarByClass(LogMain.class);

        //指定Map类和map的输出类型 Text, IntWritable
        job.setMapperClass(LogMap.class);

        // 4 设置最终输出类型
        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(Text.class);


        // 设置reducetask个数为0
        job.setNumReduceTasks(0);

        //指定数据输入的路径和输出的路径
        FileInputFormat.setInputPaths(job,new Path(args[0]));
        FileOutputFormat.setOutputPath(job,new Path(args[1]));

        //提交任务
        job.waitForCompletion(true);

        long endtime = System.currentTimeMillis();
        System.out.println((endtime-starttime)/1000);
    }
}
