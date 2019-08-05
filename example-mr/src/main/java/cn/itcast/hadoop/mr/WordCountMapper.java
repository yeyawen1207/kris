package cn.itcast.hadoop.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        //拿到传入进来的一行内容，吧数据类型转化为string
        String line = value.toString();

        //按照分隔符进行切割
        String[] words = line.split(" ");

        for (String word : words){

            context.write(new Text(word), new IntWritable(1));
        }
    }
}
