package cn.edv.scujcc.mymusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
    implements ChannelRvAdapter.ChannelClickListener {
    private RecyclerView channelRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.channelRv=findViewById(R.id.channel_rv);
        ChannelRvAdapter rvAdapter = new ChannelRvAdapter(this);
        this.channelRv.setAdapter(rvAdapter);
        this.channelRv.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onChannelClick(int position) {
        //转到新界面，意图Intent
        Intent intent = new Intent(MainActivity.this,playerActivity.class);
        startActivity(intent);

    }
}
