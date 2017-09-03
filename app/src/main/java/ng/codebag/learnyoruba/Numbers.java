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
        words.add(new Word("one", "oókan", R.drawable.number_one));
        words.add(new Word("two", "meéjì", R.drawable.number_two));
        words.add(new Word("thee", "méta", R.drawable.number_three));
        words.add(new Word("four", "mérin", R.drawable.number_four));
        words.add(new Word("five", "márùn-ún",R.drawable.number_five));
        words.add(new Word("six", "mẹ́fà", R.drawable.number_six));
        words.add(new Word("seven", "méje", R.drawable.number_seven));
        words.add(new Word("eight", "méjo", R.drawable.number_eight));
        words.add(new Word("nine", "mẹ́sàn-án", R.drawable.number_nine));
        words.add(new Word("ten", "mẹ́wàá", R.drawable.number_ten));
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