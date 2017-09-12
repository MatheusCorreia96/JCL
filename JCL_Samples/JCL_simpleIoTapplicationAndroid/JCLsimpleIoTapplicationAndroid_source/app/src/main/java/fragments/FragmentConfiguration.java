package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jcl.jcl_androidapplication.ListViewItemsAdapter;
import com.jcl.jcl_androidapplication.R;

import java.util.List;

/**
 * Created by estevao on 31/05/17.
 */

public class FragmentConfiguration extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_configuration, container,
                false);


        return view;
    }
}