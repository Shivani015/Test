package com.example.joker.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.
public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerView);

        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.
         class Hero {

            private String name, detail;
            public  int id;



            public Hero(int id, String name, String detail) {

                this.id =id;
                this.name =name;
                this.detail =detail;

            }

            public int getId() {
                return id;
            }
            public void setId(int id) {this.id =id;}

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDetail() { return  detail;}

            public  void  setDetail(String detail) {this.detail=detail;}

            }

        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.

        movieAdapter =new MovieAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("batman","1996: directed by Leslie H. Martinson; starring Adam West, Burt Ward, Cesar Romero, Burgess Meredith; ");
        movie.setimage(R.drawable.batman);
        movieList.add(movie);

        movie = new Movie("deadpool","2016 :American superhero film based on the Marvel Comics character of the same name, distributed by 20th Century Fox");
        movie.setimage(R.drawable.deadpool);
        movieList.add(movie);

        movie = new Movie("doctor_strange","2016 American superhero film based on the Marvel Comics character of the same name, produced by Marvel Studios");
        movie.setimage(R.drawable.doctor_strange);
        movieList.add(movie);

        movie = new Movie("iron_man","2008 American superhero film based on the Marvel Comics character of the same name, produced by Marvel Studios");
        movie.setimage(R.drawable.iron_man);
        movieList.add(movie);

        movie = new Movie("spiderman","2002 American superhero film directed by Sam Raimi");
        movie.setimage(R.drawable.spiderman);
        movieList.add(movie);

        movie = new Movie("thor","2011 American superhero film based on the Marvel Comics character of the same name, produced by Marvel Studios");
        movie.setimage(R.drawable.thor);
        movieList.add(movie);



        movieAdapter.notifyDataSetChanged();

    //


    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.


}
