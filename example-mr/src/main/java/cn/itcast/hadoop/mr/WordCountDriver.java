package cn.itcast.hadoop.mr;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCountDriver {
    public static void main(String[] args) throws Exception{
        //通过Job来封装本次mr的相关信息
        Configuration conf = new Configuration();
        //本地运行
        conf.set("mapreduce.framework.name", "local");
        Job job = Job.getInstance(conf);

        //指定本次mr  job  jar包运行主类
        job.setJarByClass(WordCountDriver.class);

        //指定本次mr 所用的mapper  reducer类分别是什么
        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);

        //指定本次mr mapper阶段的输出k v类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        //指定本次mr 最终输出的k v类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        //指定本次mr 输入的数据路径和最终输出的数据路径
        //注意导入的包的路径，FileInputFormat有两个不同的包,选择有lib的那个
        //路径需要制定到文件，即1.txt但是视频中没有，不知道设置了什么
//        FileInputFormat.setInputPaths(job, "D:/mr/input");
        FileInputFormat.addInputPaths(job, "D:/mr/input/1.txt");
        FileInputFormat.addInputPaths(job, "D:/mr/input/2.txt");
        FileOutputFormat.setOutputPath(job, new Path("D:/mr/output"));

        //提交程序并且监控打印程序执行情况
        boolean b = job.waitForCompletion(true);
        System.exit(b?0:1);
    }
}
