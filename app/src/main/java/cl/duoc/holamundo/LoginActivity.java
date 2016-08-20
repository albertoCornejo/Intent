package cl.duoc.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText txtUsuario, txtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //
        setContentView(R.layout.activity_login);

        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validaUsuario();

            }
        });
    }

    private void validaUsuario() {
        if(txtUsuario.getText().toString().equals("admin") &&txtPassword.getText().toString().equals("admin"))
        {
            Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), MenuPrincipalActivity.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}

