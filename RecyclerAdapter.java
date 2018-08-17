/*
 Raylph Evangelista
 revange9@my.smccd.edu
 CIS 135OL
 RecyclerAdapter.java

 This file is the file that will help to add the recycler view to the actual app. This file will
 make it so that the cards will be reused instead of making tons of new cards and storing all
 of them into memory. This class will also hold the employeeList of all the employees from the
 office. This file also contains the method loadData() which will add all the employee objects
 to the list of employees.

 Assignment #4
 4/6/18
*/

package com.evangelista.officecards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.design.widget.Snackbar;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Employee> employeeList)
    {
        this.employeeList = employeeList;
        loadData();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout,
            viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i)
    {
        viewHolder.itemTitle.setText(employeeList.get(i).getEmpName());
        viewHolder.itemDetail.setText(employeeList.get(i).getEmpPosition());
        viewHolder.itemImage.setImageResource(employeeList.get(i).getEmpPicture());
    }

    @Override
    public int getItemCount()
    {
        return employeeList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView)
        {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    int position = getAdapterPosition();
                    Snackbar.make(v, "Click detected on " + employeeList.get(position)
                        .getEmpName(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                }
            });
        }
    }

    private void loadData()
    {
        employeeList.add(new Employee("Pamela Beesly", "Receptionist", R.drawable.pamela_beesly));
        employeeList.add(new Employee("Andy Bernard", "Sales Director", R.drawable.andy_bernard));
        employeeList.add(new Employee("Creed Bratton", "Quality Assurance", R.drawable.creed_bratton));
        employeeList.add(new Employee("Jim Halpert", "Assistant Regional Manager", R.drawable.jim_halpert));
        employeeList.add(new Employee("Ryan Howard", "Vice President, North East", R.drawable.ryan_howard));
        employeeList.add(new Employee("Stanley Hudson", "Sales Representative", R.drawable.stanley_hudson));
        employeeList.add(new Employee("Kelly Kapoor", "Customer Service Rep.", R.drawable.kelly_kapoor));
        employeeList.add(new Employee("Phyllis Lapin", "Sales Representative", R.drawable.phyllis_lapin));
        employeeList.add(new Employee("Kevin Malone", "Accountant", R.drawable.kevin_malone));
        employeeList.add(new Employee("Angela Martin", "Senior Accountant", R.drawable.angela_martin));
        employeeList.add(new Employee("Oscar Martinez", "Accountant", R.drawable.oscar_martinez));
        employeeList.add(new Employee("Meredith Palmer", "Supplier Relations", R.drawable.meredith_palmer));
        employeeList.add(new Employee("Dwight Schrute", "Assistant Regional Manager", R.drawable.dwight_schrute));
        employeeList.add(new Employee("Michael Scott", "Regional Manager", R.drawable.michael_scott));
        employeeList.add(new Employee("Toby Flenderson", "Human Resources Manager", R.drawable.toby_flenderson));
    }
}
