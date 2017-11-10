package ng.codebag.learnyoruba;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("What is your name?", "Kí ni orúkọ rẹ?"));
        words.add(new Word("My name is...", "orúkọ mi ni..."));
        words.add(new Word("How are you ?", "Báwo ni?"));
        words.add(new Word("I’m fine.", "Mowa pa."));


//        ArrayList<String>

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.the_list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
