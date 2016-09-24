package rifamardiana.lat_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editUsername;
    private EditText editPassword;
    private Button btnLogin;
    private TextView txtStatus;
    String username, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI(){
        editUsername=(EditText)findViewById(R.id.adduname);
        editUsername.getText();
        editPassword=(EditText)findViewById(R.id.addpass);
        editPassword.getText();
        btnLogin=(Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v==btnLogin){
                    if(editUsername.getText().toString().equals(username) && editPassword.getText().toString().equals(pass)){
                        txtStatus.setText("Login Berhasil");
                    }
                    else{
                        txtStatus.setText("Login Gagal");
                    }
                }
            }
        });
        txtStatus = (TextView) findViewById(R.id.txtStatus);

        username = "Rifa";
        pass = "Rifa";
    }


   public boolean onCreateOptionMenu(Menu menu){
       getMenuInflater().inflate(R.menu.menu_main,menu);
       return true;
   }

        //Inflate the menu; this adds items to the action bar if it is present.

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here. The action bar will automatically handle clicks on the Home/Up button,
        // so long as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
