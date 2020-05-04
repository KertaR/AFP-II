package com.example.lof.views;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.lof.R;
import com.example.lof.datastructures.Champions.Ameyuki_hercegno;
import com.example.lof.datastructures.Champions.Sakusa;
import com.example.lof.datastructures.Champions.Shizuki;
import com.example.lof.datastructures.Champions.Yoshi;
import com.example.lof.datastructures.Character;

import java.util.ArrayList;
import java.util.List;

public class KarakterValasztView {
    private static List<Character> karakterek = new ArrayList<>();
    private static void Listakezeles(){
        if(karakterek!=null){
            karakterek.add(new Ameyuki_hercegno());
            karakterek.add(new Sakusa());
            karakterek.add(new Shizuki());
            karakterek.add(new Yoshi());
        }
    }
    private static ImageButton GombKeszit(Context context,Character character){
        ImageButton btn = new ImageButton(context);
        btn.setImageDrawable(context.getResources().getDrawable(R.drawable.kep));
        btn.setLayoutParams(new LinearLayout.LayoutParams(75, 75));
        return btn;
    }
    public static void TablaFeltolt(TableLayout table)
    {
        Listakezeles();
        TableRow sor = new TableRow(table.getContext());
        sor.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
        int sorhossz = 0;
        for (int i = 0; i < karakterek.size() ; i++) {
            sor.addView(GombKeszit(sor.getContext(), karakterek.get(i)));
            sorhossz++;
            if(sorhossz == 5){
                table.addView(sor, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
                sorhossz = 0;
            }
        }
        if(sorhossz !=0){
            table.addView(sor, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }
}
