package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText user_input_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_input_field = (EditText) findViewById(R.id.user_input);
    }

    public void buttonClicked(View button) {

        WordCount wordcount = new WordCount();

        String inputSentence = user_input_field.getText().toString();

        int numberOfWords = wordcount.countWords(inputSentence);

        Intent intent = new Intent(this, CountActivity.class);
        intent.putExtra("number", numberOfWords);
        startActivity(intent);

    }
}