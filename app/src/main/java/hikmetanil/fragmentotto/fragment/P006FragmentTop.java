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

public class P006FragmentTop extends Fragment {
    TextView textViewFragTopP006;
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

        View view= inflater.inflate(R.layout.p006fragment_top,container,false);
        textViewFragTopP006= view.findViewById(R.id.textViewFragTopP006);
        return view;//super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public String getTextViewTextMtd(){
        return textViewFragTopP006.getText().toString();
    }
}
