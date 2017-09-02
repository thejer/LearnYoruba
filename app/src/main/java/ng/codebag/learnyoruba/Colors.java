package ng.codebag.learnyoruba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jer on 9/2/2017.
 */

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "pupa"));
        words.add(new Word("green", "àwo ewé"));
        words.add(new Word("brown", "àwo pako"));
        words.add(new Word("grey", "àwo eléerú"));
        words.add(new Word("black", "dúdú"));
        words.add(new Word("white", "funfun"));
        words.add(new Word("yellow", "iyèyè"));



//        ArrayList<String>

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.the_list);

        listView.setAdapter(adapter);




    }
}
