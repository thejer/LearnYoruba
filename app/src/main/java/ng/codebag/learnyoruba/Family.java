package ng.codebag.learnyoruba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jer on 9/2/2017.
 */

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father", "bàbá", R.drawable.family_father));
        words.add(new Word("mother", "ìyá", R.drawable.family_mother));
        words.add(new Word("son", "o̩mo̩kùnrin", R.drawable.family_son));
        words.add(new Word("daughter", "o̩mo̩ obìnrin", R.drawable.family_daughter));
        words.add(new Word("older brother", "é̩gbo̩n o̩kùnrin", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "àbúrò o̩kùnrin", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "é̩gbo̩n obìnrin", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "àbúrò obìnrin", R.drawable.family_younger_sister));
        words.add(new Word("boy", "o̩kùnrin"));
        words.add(new Word("female", "obìnrin"));


//        ArrayList<String>

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.the_list);

        listView.setAdapter(adapter);



    }

}
