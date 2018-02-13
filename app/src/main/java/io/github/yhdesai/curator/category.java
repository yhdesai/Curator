package io.github.yhdesai.curator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }
    public void channel1 (View view ){
        Intent channel1 = new Intent (this, channel1.class);
        startActivity(channel1);
    }
    public void video (View view){
        Intent video = new Intent(this, PlayerControlsDemoActivity.class);
        startActivity(video);
    }
}
