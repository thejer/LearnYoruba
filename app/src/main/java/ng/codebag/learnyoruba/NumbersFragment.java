package ng.codebag.learnyoruba;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

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

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.the_list);

        listView.setAdapter(adapter);

        return rootView;    }

}
