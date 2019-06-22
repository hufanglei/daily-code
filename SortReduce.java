package com.hfl.writeableSort2;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;

//总上行流量、下行流量、总流量（序列化）
public class SortReduce extends Reducer<FlowBean, NullWritable, FlowBean, NullWritable> {

    @Override
    protected void reduce(FlowBean bean, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {
        context.write(bean, NullWritable.get());
    }

}
