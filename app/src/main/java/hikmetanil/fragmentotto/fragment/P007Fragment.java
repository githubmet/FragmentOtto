package hikmetanil.fragmentotto.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import hikmetanil.fragmentotto.R;


public class P007Fragment extends Fragment implements RadioGroup.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {

    private static final int YES = 0;
    private static final int NO = 1;
    TextView textViewFragmentP007;
    public P007Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.p007_fragment, container, false);
        RadioGroup radioGroupP007 = view.findViewById(R.id.radioGroupP007);
        radioGroupP007.setOnCheckedChangeListener(this);
        textViewFragmentP007= view.findViewById(R.id.textViewFragmentP007);
        RatingBar ratingBarP007= view.findViewById(R.id.ratingBarP007);
        ratingBarP007.setOnRatingBarChangeListener(this);

        return view;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        RadioButton radioButton = group.findViewById(checkedId);
        int indexV = group.indexOfChild(radioButton);

        switch (indexV) {
            case YES:
                textViewFragmentP007.setText(R.string.article_like);
                break;
            case NO:
                textViewFragmentP007.setText(R.string.article_thanks);
                break;
            default:
                break;

        }

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        switch ((int)rating){
            case 0:
                Toast.makeText(getContext(), "rate= "+0, Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(getContext(), "rate= "+1, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getContext(), "rate= "+2, Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getContext(), "rate= "+3, Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(getContext(), "rate= "+4, Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(getContext(), "rate= "+5, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
