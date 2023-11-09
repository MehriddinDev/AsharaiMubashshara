package uz.gita.asharaimubashshara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        findViewById(R.id.btn).setOnClickListener(v->{
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
        });

        getWindow().setNavigationBarColor(Color.parseColor("#FFFFEE"));
    }
}