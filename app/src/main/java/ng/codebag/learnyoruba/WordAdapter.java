package ng.codebag.learnyoruba;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jer on 9/2/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
//    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
//        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.each_word, parent, false);
        }

        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView yorubaTextView = (TextView) listItemView.findViewById(R.id.yoruba_id);
        // set this text on the name TextView
        yorubaTextView.setText(currentWord.getYorubaTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_id);
        // set this text on the number TextView
        englishTextView.setText(currentWord.getEnglishWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_id);

        if (currentWord.yesImage()){
            imageView.setImageResource(currentWord.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_views);
        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

