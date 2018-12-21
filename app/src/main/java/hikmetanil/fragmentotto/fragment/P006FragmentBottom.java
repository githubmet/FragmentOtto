package hikmetanil.fragmentotto.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hikmetanil.fragmentotto.R;

public class P006FragmentBottom extends Fragment {
    TextView textViewFragBottomP006;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.p006fragment_bottom,container,false);
        textViewFragBottomP006= view.findViewById(R.id.textViewFragBottomP006);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public void setTextViewTextMtd(String textViewV){
        textViewFragBottomP006.setText(textViewV);
    }
}
