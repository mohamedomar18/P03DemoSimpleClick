package sg.edu.rp.c346.id20048218.p03demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tBtn;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tBtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        System.out.println("test onCreate");

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();

                if(checkedRadioId == R.id.radioButtonGenderMale){
                    strResponse = "He says " + strResponse;
                }
                else {
                    strResponse = "She says " + strResponse;
                }
                tvDisplay.setText(strResponse);
            }
        });

        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tBtn.isChecked()) {
                    etInput.setEnabled(true);

                }
                else {
                    etInput.setEnabled(false);
            }
        }
    });
    }
}


