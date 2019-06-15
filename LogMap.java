package com.hfl.log2;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

/**
 * 对web访问日志中的各字段识别切分
 * 去除日志中不合法的记录（1.字段小于等于11不合法  2.状态码大于等于400）
 * 根据统计需求，生成各类访问请求过滤数据
 */
public class LogMap extends Mapper<LongWritable, Text, NullWritable, Text> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
//      super.map(key, value, context);
        String line = value.toString();
        LogBean bean = parseLog(line, context);
        if(bean.isValid()){
            context.write(NullWritable.get(),new Text(bean.toString()));
        }
    }

    private LogBean parseLog(String line, Context context) {
        LogBean logBean = new LogBean();
        String[] fields = line.split(" ");
        if(fields.length > 11){
            logBean.setAddr(fields[0]);
            logBean.setUser(fields[1]);
            logBean.setTime(fields[3].substring(1));
            logBean.setRequest(fields[6]);
            logBean.setStatus(fields[8]);
            logBean.setSize(fields[9]);
            logBean.setReferer(fields[10]);
            if(fields.length>12){
                logBean.setUser_agent(fields[11]+fields[12]);
            }else {
                logBean.setUser_agent(fields[11]);
            }
            if(Integer.parseInt(logBean.getStatus())>=400){
                logBean.setValid(false);
            }
        }else {
            logBean.setValid(false);
        }
        return logBean;
    }

}
