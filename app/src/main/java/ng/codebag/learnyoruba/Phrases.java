package ng.codebag.learnyoruba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jer on 9/2/2017.
 */

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("What is your name?", "Kí ni orúkọ rẹ?"));
        words.add(new Word("My name is...", "orúkọ mi ni..."));
        words.add(new Word("How are you ?", "Báwo ni?"));
        words.add(new Word("I’m fine.", "Mowa pa."));


//        ArrayList<String>

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.the_list);

        listView.setAdapter(adapter);



    }

}
