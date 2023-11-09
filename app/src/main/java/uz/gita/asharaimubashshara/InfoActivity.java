package uz.gita.asharaimubashshara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
TextView titleBase;
TextView titleSecond;
TextView txtLink;
TextView text;
ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        findView();
        getWindow().setNavigationBarColor(Color.parseColor("#FFFFEE"));

        Intent i = getIntent();
        int pos = i.getIntExtra("POS",0);

        switch (pos){
            case 0:
                titleBase.setText("Abu Bakr Siddiq");
                titleSecond.setText("Abu Bakr Siddiq roziyallohu anhu");
                text.setText(R.string.abuBakr);
                txtLink.setText(R.string.linkAbuBakr);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 1:
                titleBase.setText("Umar ibn Xattob");
                titleSecond.setText("Umar ibn Xattob roziyallohu anhu");
                text.setText(R.string.umar);
                txtLink.setText(R.string.linkUmar);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 2:
                titleBase.setText("Usmon ibn Affon");
                titleSecond.setText("Usmon ibn Affon roziyallohu anhu");
                text.setText(R.string.usmon);
                txtLink.setText(R.string.linkUsmon);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 3:
                titleBase.setText("Ali ibn Abu Tolib");
                titleSecond.setText("Ali ibn Abu Tolib roziyallohu anhu");
                text.setText(R.string.aliy);
                txtLink.setText(R.string.linkAli);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 4:
                titleBase.setText("Abu Ubayda ibn Jarroh");
                titleSecond.setText("Abu Ubayda ibn Jarroh roziyallohu anhu");
                text.setText(R.string.abuUbayda);
                txtLink.setText(R.string.linkAbuUbayda);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 5:
                titleBase.setText("Saʼd ibn Abu Vaqqos");
                titleSecond.setText("Saʼd ibn Abu Vaqqos roziyallohu anhu");
                text.setText(R.string.sad);
                txtLink.setText(R.string.linkSad);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 6:
                titleBase.setText("Abdurahmon ibn Avf");
                titleSecond.setText("Abdurahmon ibn Avf roziyallohu anhu");
                text.setText(R.string.abdurahmon);
                txtLink.setText(R.string.linkAbdurrohman);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 7:
                titleBase.setText("Zubayr ibn Avvom");
                titleSecond.setText("Zubayr ibn Avvom roziyallohu anhu");
                text.setText(R.string.zubayr);
                txtLink.setText(R.string.linkZubayr);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 8:
                titleBase.setText("Talha ibn Ubaydulloh");
                titleSecond.setText("Talha ibn Ubaydulloh roziyallohu anhu");
                text.setText(R.string.talha);
                txtLink.setText(R.string.linkTalha);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;
            case 9:
                titleBase.setText("Said ibn Zayd");
                titleSecond.setText("Said ibn Zayd roziyallohu anhu");
                text.setText(R.string.zayd);
                txtLink.setText(R.string.linkZayd);
                txtLink.setMovementMethod(LinkMovementMethod.getInstance());
                txtLink.setLinkTextColor(Color.parseColor("#009788"));
                break;

        }

        btn.setOnClickListener(v->{
            Intent k = new Intent(this,MainActivity.class);
            startActivity(k);
            finish();
        });
    }

    private void findView(){
        titleBase = findViewById(R.id.txtTitle);
        titleSecond = findViewById(R.id.txtTitle1);
        text = findViewById(R.id.itemBody);
        btn = findViewById(R.id.btn);
        txtLink = findViewById(R.id.Link);
    }
}