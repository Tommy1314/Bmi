package ctlove.com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edweight;
    private EditText edheight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
    }

    private void findviews() {
        edweight = findViewById(R.id.ed_Weight);
        edheight = findViewById(R.id.ed_height);
        result = findViewById(R.id.result);
        Button help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(getString(R.string.help))
                        .setMessage(getString(R.string.bmi_info))
                        .setPositiveButton(getString(R.string.ok), null)
                        .show();
                
            }
        });

    }

    public void bmi(View view){
        String w = edweight.getText().toString();
        String h = edheight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity", "BMI:" + bmi);
        Toast.makeText(this, "Your BMI is " + bmi, Toast.LENGTH_LONG).show();
        result.setText(getString(R.string.your_bmi_is) + bmi);
        new AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage(getString(R.string.your_bmi_is) + bmi)
                .setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        edweight.setText("");
                        edheight.setText("");
                    }
                })
                .show();
    }
}
