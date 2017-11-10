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
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Inflate the layout for this fragment
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


        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.the_list);

        listView.setAdapter(adapter);

        return rootView;    }

}
