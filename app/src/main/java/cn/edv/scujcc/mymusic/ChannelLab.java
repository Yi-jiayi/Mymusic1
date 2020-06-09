package cn.edv.scujcc.mymusic;

import java.util.ArrayList;
import java.util.List;

/*
单例数据源，提供用户数据
 */
public class ChannelLab {
    List<Channel>data;
    //TODO未实现单例，可能会有多个实例
    public ChannelLab(){
        test();
    }
    /*
    生成测试数据，用于引入网络前的项目
     */
    private void test(){
        data = new ArrayList<>();
        Channel c = new Channel();
        c.setTitle("--手游大仙");
        c.setTime("2018年08月22日");
        c.setHead(R.drawable.touxiang1);
        c.setComments("评论XXXXXXXXXXXXXXXXXXXXXX1");
        c.setQuantity("284526");
        data.add(c);
        c = new Channel();
        c.setTitle("要杯冰的");
        c.setTime("2018年08月21日");
        c.setHead(R.drawable.touxiang2);
        c.setComments("评论XXXXXXXXXXXXXXXXXXXXXX2");
        c.setQuantity("200100");
        data.add(c);
        c = new Channel();
        c.setTitle("BU_ke不可");
        c.setTime("2018年02月10日");
        c.setHead(R.drawable.touxiang3);
        c.setComments("评论XXXXXXXXXXXXXXXXXXXXXX3");
        c.setQuantity("154523");
        data.add(c);
        c = new Channel();
        c.setTitle("欧克欧克");
        c.setTime("2018年02月15日");
        c.setHead(R.drawable.touxiang4);
        c.setComments("评论XXXXXXXXXXXXXXXXXXXXXX4");
        c.setQuantity("50421");
        data.add(c);
        c = new Channel();
        c.setTitle("小淘陶");
        c.setTime("2018年04月22日");
        c.setQuantity("4561");
        c.setHead(R.drawable.touxiang5);
        c.setComments("评论XXXXXXXXXXXXXXXXXXXXXX5");
        data.add(c);

    }
    /*
    *获取多少个用户
     */
    public int getSize() {
        return data.size();
    }
    /*
    获取一个指定频道
    @param position用户顺序
    @return 用户对象Channel
     */

    public Channel getChannel(int position){
        return data.get(position);
    }

}

