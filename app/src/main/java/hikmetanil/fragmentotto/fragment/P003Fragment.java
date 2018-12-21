package hikmetanil.fragmentotto.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hikmetanil.fragmentotto.R;

public class P003Fragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("fragment_lifecycle","fragment_onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("fragment_lifecycle","fragment_onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("fragment_lifecycle","fragment_onCreateView()");
        TextView textView=new TextView(getContext());
        textView.setText(R.string.text);
        return textView;//super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onPause() {
        Log.i("fragment_lifecycle","fragment_onPause()");
        super.onPause();
    }
}
