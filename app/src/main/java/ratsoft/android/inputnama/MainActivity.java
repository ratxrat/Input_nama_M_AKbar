package ratsoft.android.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    * M AKBAR
    * */
    private TextView tv ;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.inputNama);
        tv = findViewById(R.id.txtNama);
    }

    public void tampil(View view) {
        String name = input.getText().toString();
        tv.setText(getString(R.string.nama_anda,name));

    }
}