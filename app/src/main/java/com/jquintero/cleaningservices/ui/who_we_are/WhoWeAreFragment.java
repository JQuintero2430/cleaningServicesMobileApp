package com.jquintero.cleaningservices.ui.who_we_are;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.jquintero.cleaningservices.databinding.FragmentWhoWeAreBinding;

public class WhoWeAreFragment extends Fragment {

private FragmentWhoWeAreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        WhoWeAreViewModel slideshowViewModel =
                new ViewModelProvider(this).get(WhoWeAreViewModel.class);

    binding = FragmentWhoWeAreBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textWhoWeAre;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}