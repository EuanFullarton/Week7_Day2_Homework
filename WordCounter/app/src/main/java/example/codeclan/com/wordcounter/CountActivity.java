package example.codeclan.com.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {

    private TextView numberOfWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        numberOfWords = (TextView) findViewById(R.id.number_of_words);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int number = extras.getInt("number");
        numberOfWords.setText("The count was: " + number);
    }
}