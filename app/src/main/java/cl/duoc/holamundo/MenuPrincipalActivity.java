package cl.duoc.holamundo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {


    private Button btnLlamar,btnInternet,btnSms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnLlamar = (Button)findViewById(R.id.btnLlamar);
        btnInternet = (Button)findViewById(R.id.btnInternet);
        btnSms = (Button)findViewById(R.id.btnSms);

    btnLlamar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:"+"56952511334"));
            startActivity(i);

        }
    });

        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);

            }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(Intent.ACTION_VIEW);
                intentt.setData(Uri.parse("sms:"));
                intentt.setType("vnd.android-dir/mms-sms");
                intentt.putExtra(Intent.EXTRA_TEXT, "");
                intentt.putExtra("address",  "56952511334");
                startActivity(intentt);

            }
        });


    }
}


