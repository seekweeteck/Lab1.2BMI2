package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Delcare gloabl variable here
    private EditText editTextWeight, editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        textViewResult = (TextView)findViewById(R.id.textViewBMI);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);
    }

    public void calculateBMI(View view){
        //TODO: calculate BMI and display the result
        double weight, height, bmi=0;

        weight = Double.parseDouble(editTextWeight.getText().toString());

        //Set image during run time
        imageViewResult.setImageResource(R.drawable.normal);

        textViewResult.setText(getString(R.string.normal) + " " + bmi);
    }
}
