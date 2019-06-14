package com.hfl.work;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class ClassMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        long starttime = System.currentTimeMillis();
        args=new String[]{"F:\\input\\work.txt","F:\\output\\homework23"};
        //获取配置文件
        Configuration conf = new Configuration();
        //创建job任务
        Job job = Job.getInstance(conf);
        job.setJarByClass(ClassMain.class);

        //指定Map类和map的输出类型 Text, IntWritable
        job.setMapperClass(ClassMap.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        //分区
        job.setPartitionerClass(ClassPartion.class);
        job.setNumReduceTasks(3);

        job.setReducerClass(ClassReduce.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        FileInputFormat.setInputPaths(job,new Path(args[0]));
        FileOutputFormat.setOutputPath(job,new Path(args[1]));

        //提交任务
        job.waitForCompletion(true);

        long endtime = System.currentTimeMillis();
        System.out.println((endtime-starttime)/1000);

    }
}
