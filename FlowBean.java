package com.hfl.writeableSort2;

import lombok.Getter;
import lombok.Setter;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

//统计手机号耗费的总上行流量、下行流量、总流量（序列化）
@Setter
@Getter
public class FlowBean implements WritableComparable<FlowBean> {
    private long id;
    private double price;

    //无参数的构造方法，在反序列化的时候调用
    public FlowBean() {
    }

    @Override
    public int compareTo(FlowBean o) {
        if (this.id > o.id) {
            return 1;
        }else if(this.id < o.id){
            return -1;
        }else{
            return this.price > o.price ? -1 : 1;
        }
    }

    @Override
    public void write(DataOutput output) throws IOException {
        output.writeLong(this.id);
        output.writeDouble(this.price);
    }

    @Override
    public void readFields(DataInput input) throws IOException {
        this.id = input.readLong();
        this.price = input.readDouble();
    }

    @Override
    public String toString() {
        return this.id + "\t" + this.price;
    }

}
