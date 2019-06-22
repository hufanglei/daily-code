package com.hfl.joinPartition;

import com.hfl.driver.Drive;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.net.URISyntaxException;

public class MapJoinMain {

    public static void main(String[] args) throws ClassNotFoundException, URISyntaxException, InterruptedException, IOException {
        args = new String[]{"F:\\input\\mapjoin\\order.txt", "F:\\input\\mapper2", "file:///F:/input/mapjoin/pd.txt"};
        Drive.run(MapJoinMain.class, MapJoin.class, Text.class, NullWritable.class, 0, args[0], args[1], args[2]);
    }

}
