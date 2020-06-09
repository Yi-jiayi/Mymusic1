package cn.edv.scujcc.mymusic;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChannelRvAdapter extends RecyclerView.Adapter <ChannelRvAdapter.ChannelRowHolder> {
    private ChannelLab lab = new ChannelLab();
    private ChannelClickListener listener;

    public ChannelRvAdapter(ChannelClickListener lis){
        this.listener =lis;

    }

    @NonNull
    @Override
    public ChannelRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.channel_row,parent, false);
        ChannelRowHolder holder=new ChannelRowHolder(rowView);
        return holder;
    }

    @Override
    public int getItemCount() {
        //TODO 此处暂时硬编码为30
        return lab.getSize();
    }

    @Override
    public void onBindViewHolder(@NonNull ChannelRowHolder holder, int position) {
        Channel c =lab.getChannel(position);
        holder.bind(c);
    }


    public class ChannelRowHolder extends RecyclerView.ViewHolder {
        private TextView title;//网名
        private ImageView head;//头像
        private TextView comments;//评论
        private  TextView time;//时间
        private TextView quantity;//数量

        public ChannelRowHolder(@NonNull View row) {
            super(row);
            this.title = row.findViewById(R.id.channel_title);
            this.time =row.findViewById(R.id.channel_time);
            this.head =row.findViewById(R.id.channel_head);
            this.comments =row.findViewById(R.id.channel_comments);
            this.quantity =row.findViewById(R.id.channel_quantity);
            row.setOnClickListener((v) -> {
                int position = getLayoutPosition();
                Log.d("DD",position+"行被点击啦！");
                //TODO 调用实际代码
                listener.onChannelClick(position);
            });
        }
        public void bind (Channel c) {
            this.title.setText(c.getTitle());
            this.time.setText(c.getTime());
            this.head.setImageResource(c.getHead());
            this.comments.setText(c.getComments());
            this.quantity.setText(c.getQuantity());
        }
    }
    //定义新接口
    public interface ChannelClickListener {
        public void onChannelClick(int position);

    }
}
