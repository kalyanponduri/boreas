package com.boreas.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boreas.activities.HomeActivity;
import com.boreas.adapters.ChatsAdapter;
import com.e.boreas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserChatsFragment extends Fragment {

    public static final String EXTRA_TAB_NAME = "tab_name";
    private String mTabName;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private HomeActivity mParent;
    private View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mParent = (HomeActivity) getActivity();
    }

    public static UserChatsFragment newInstance(String tabName) {
        Bundle args = new Bundle();
        args.putString(EXTRA_TAB_NAME, tabName);
        UserChatsFragment fragment = new UserChatsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.fragment_user_chats, container, false);
        mTabName = getArguments().getString(EXTRA_TAB_NAME);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initUI();
    }

    private void initUI() {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(mParent);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ChatsAdapter();
        recyclerView.setAdapter(mAdapter);
    }

}
