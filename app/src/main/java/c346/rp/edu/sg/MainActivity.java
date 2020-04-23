package c346.rp.edu.sg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbDisplay = findViewById(R.id.toggleButtonEnabled);

        tbDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

            // Code for the action
            if (tbDisplay.isChecked()) {
                // Add your code for the action
                btnDisplay.setEnabled(false);
                etInput.setEnabled(false);
            } else {
                btnDisplay.setEnabled(true);
                etInput.setEnabled(true);
            }
        }
    });
}
}

