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
        words.add(new Word("red", "pupa", R.drawable.color_red));
        words.add(new Word("green", "àwo ewé", R.drawable.color_green));
        words.add(new Word("brown", "àwo pako", R.drawable.color_brown));
        words.add(new Word("grey", "àwo eléerú", R.drawable.color_gray));
        words.add(new Word("black", "dúdú", R.drawable.color_black));
        words.add(new Word("white", "funfun", R.drawable.color_white));
        words.add(new Word("yellow", "iyèyè", R.drawable.color_mustard_yellow));



//        ArrayList<String>

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.the_list);

        listView.setAdapter(adapter);




    }
}
