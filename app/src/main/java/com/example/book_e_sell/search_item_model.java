package com.example.book_e_sell;

import com.firebase.ui.database.FirebaseRecyclerOptions;

public class search_item_model
{
    String category,pic,name,price;
    search_item_model()
    {

    }
    public search_item_model(String category, String name, String price, String pic) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.pic = pic;
    }

    public String getpic() {
        return pic;
    }

    public void setpic(String pic) {
        this.pic = pic;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }
}
