package com.radacode.petagrammascotas.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.radacode.petagrammascotas.pojo.Mascota;
import com.radacode.petagrammascotas.adapter.MascotaAdapter;
import com.radacode.petagrammascotas.R;

import java.util.ArrayList;

public class FragmentPrincipal extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_principal, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        iniciarlizarListaMascotas();
        inicializarAdaptador();

        // Inflate the layout for this fragment
        return v;
    }

    public void iniciarlizarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.p1, "Chimuelo","12"));
        mascotas.add(new Mascota(R.drawable.p2, "Princeso","8"));
        mascotas.add(new Mascota(R.drawable.p3, "Mateo","3"));
        mascotas.add(new Mascota(R.drawable.p4, "Pablo","23"));
        mascotas.add(new Mascota(R.drawable.p5, "Pugceso","5"));
    }

    public void inicializarAdaptador(){
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adapter);
    }
}