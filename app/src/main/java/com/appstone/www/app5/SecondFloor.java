package com.appstone.www.app5;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by aishwaryatalapuru on 01/02/17.
 */

public class SecondFloor extends ListFragment {
    String[] tables= {"table1","table2","table2"};
    ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_multiple_choice, tables);
        setListAdapter(adapter);





        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}


