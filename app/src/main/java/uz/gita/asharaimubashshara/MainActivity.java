package uz.gita.asharaimubashshara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CardView view1;
    CardView view2;
    CardView view3;
    CardView view4;
    CardView view5;
    CardView view6;
    CardView view7;
    CardView view8;
    CardView view9;
    CardView view10;

    ArrayList<CardView> views;
    ImageView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        clickEvents();
        getWindow().setNavigationBarColor(Color.parseColor("#FFFFEE"));
    }

    private void clickEvents() {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            views.get(i).setOnClickListener(v->{
                Intent intent = new Intent(this,InfoActivity.class);
                intent.putExtra("POS", finalI);
                startActivity(intent);
            });
        }
        view1.setOnClickListener(v->{
            Intent intent = new Intent(this,InfoActivity.class);
            intent.putExtra("POS", 0);
            startActivity(intent);
        });

        btn.setOnClickListener(v->{
            Intent i = new Intent(this,AboutActivity.class);
            startActivity(i);
        });
    }

    private void findView() {
        btn = findViewById(R.id.btn);

        view1 = findViewById(R.id.c1);
        view2 = findViewById(R.id.c2);
        view3 = findViewById(R.id.c3);
        view4 = findViewById(R.id.c4);
        view5 = findViewById(R.id.c5);
        view6 = findViewById(R.id.c6);
        view7 = findViewById(R.id.c7);
        view8 = findViewById(R.id.c8);
        view9 = findViewById(R.id.c9);
        view10 = findViewById(R.id.c10);

        views = new ArrayList<>(10);
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);
        views.add(view5);
        views.add(view6);
        views.add(view7);
        views.add(view8);
        views.add(view9);
        views.add(view10);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
moveTaskToBack(true);
    }
}