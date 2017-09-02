package ng.codebag.learnyoruba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jer on 9/2/2017.
 */

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "oókan"));
        words.add(new Word("two", "meéjì"));
        words.add(new Word("thee", "méta"));
        words.add(new Word("four", "mérin"));
        words.add(new Word("five", "márùn-ún"));
        words.add(new Word("six", "mẹ́fà"));
        words.add(new Word("seven", "méje"));
        words.add(new Word("eight", "méjo"));
        words.add(new Word("nine", "mẹ́sàn-án"));
        words.add(new Word("ten", "mẹ́wàá"));
        words.add(new Word("twenty", "ogún"));
        words.add(new Word("thirty", "ọgbọ̀n"));
        words.add(new Word("forty", "ogójì"));
        words.add(new Word("fifty", "àádọ́ta"));
        words.add(new Word("sixty", "ọgóta"));
        words.add(new Word("seventy", "àádọ́rin"));
        words.add(new Word("eighty", "ọgọ́rin"));
        words.add(new Word("ninety", "àádọ́rùn-ún"));
        words.add(new Word("one hundred", "ọgọ́rùn-ún"));



        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.the_list);

        listView.setAdapter(adapter);



    }

}