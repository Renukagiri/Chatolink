package sample.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener{
    private Button reg;
    private Button tvlogin;

    private EditText etEmail, etPass;
    private DbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        setContentView(R.layout.activity_register);

        db = new DbHelper(this);
        reg = (Button)findViewById(R.id.btnReg);

        tvlogin = (Button)findViewById(R.id.login);
        etEmail = (EditText)findViewById(R.id.etEmail);
        etPass = (EditText)findViewById(R.id.etPass);
        reg.setOnClickListener(this);
        tvlogin.setOnClickListener(this);
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnReg:
                register();
                break;
            case R.id.login:
                startActivity(new Intent(Register.this,loginActivity.class));
                finish();
                break;
            default:

        }
    }

    private void register(){
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();
        if(email.isEmpty() && pass.isEmpty()){
            displayToast("Username/password field empty");
        }else{
            db.addUser(email,pass);
            displayToast("User registered");
            finish();
        }
    }

    private void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}