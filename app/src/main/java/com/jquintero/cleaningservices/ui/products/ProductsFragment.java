package com.jquintero.cleaningservices.ui.products;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.jquintero.cleaningservices.databinding.FragmentProductsBinding;

public class ProductsFragment extends Fragment {

private FragmentProductsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        ProductsViewModel galleryViewModel =
                new ViewModelProvider(this).get(ProductsViewModel.class);

    binding = FragmentProductsBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textProducts;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}