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
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "pupa", R.drawable.color_red));
        words.add(new Word("green", "àwo ewé", R.drawable.color_green));
        words.add(new Word("brown", "àwo pako", R.drawable.color_brown));
        words.add(new Word("grey", "àwo eléerú", R.drawable.color_gray));
        words.add(new Word("black", "dúdú", R.drawable.color_black));
        words.add(new Word("white", "funfun", R.drawable.color_white));
        words.add(new Word("yellow", "iyèyè", R.drawable.color_mustard_yellow));



//        ArrayList<String>

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.the_list);

        listView.setAdapter(adapter);



        return rootView;    }

}
