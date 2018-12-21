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
import hikmetanil.fragmentotto.communication.P005Interface;

public class P005FragmentTop extends Fragment implements View.OnClickListener {
    TextView textViewFragTopP005;
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

        View view=inflater.inflate(R.layout.p005fragment_top,container,false);
        textViewFragTopP005= view.findViewById(R.id.textViewFragTopP005);
        view.findViewById(R.id.buttonFragTopP005).setOnClickListener(this);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonFragTopP005){
            P005Interface p005Interface=(P005Interface) getActivity();
            p005Interface.moveDataMtd(textViewFragTopP005.getText().toString());
        }
    }
}

