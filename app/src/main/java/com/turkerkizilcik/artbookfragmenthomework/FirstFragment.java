package com.turkerkizilcik.artbookfragmenthomework;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.turkerkizilcik.artbookfragmenthomework.databinding.FragmentFirstBinding;
import java.util.ArrayList;


public class FirstFragment extends Fragment  {


    ArrayList<Landmark> landmarkArrayList;
    private FragmentFirstBinding binding;


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        landmarkArrayList = new ArrayList<>();

        //Data
        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        //Adapter
            //Listview

        //mapping (fena)
        //ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,
               //landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        //binding.fragmentFirst.setAdapter(arrayAdapter);

        //binding.fragmentFirst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //@Override
            //public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getContext(), landmarkArrayList.get(i).name , Toast.LENGTH_SHORT).show();
                //FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(i,"age");
                //action.setArtId()
               // Navigation.findNavController(getActivity(), R.id.fragmentContainerView).navigate(action);
            //}
       //});

    }

}