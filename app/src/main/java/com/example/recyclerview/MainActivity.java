package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.xml.sax.helpers.XMLReaderAdapter;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private static List<Article> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articleList = new ArrayList<>();

        Article article1 = new Article(R.drawable.pic_plant, "Talking plant arrested for public disturbance", "Scientists were shocked to discover a plant that could speak specifically English, and even more shocked when it refused to shut up. So it was arrested for being annoying because there is a law for that");
        articleList.add(article1);
        Article article2 = new Article(R.drawable.pic_water, "Study finds that you are thirsty because you drink water", "In a groundbreaking study, researchers found that drinking more water can actually make you more thirsty. The more water you drink, the more you will want to drink, creating an endless cycle of dehydration. So next time you feel parched, just remember: water is not the answer.");
        articleList.add(article2);
        Article article3 = new Article(R.drawable.pic_oxygen, "What if Oxygen is toxic but it takes 60 - 100 years to kill you", "It might seem like a relief, but paranoia would set in, and we'd obsessively monitor our oxygen intake, wearing masks and stockpiling canisters. We'd become a society of oxygen hoarders, living in air-tight bunkers, and possibly even chopping down trees and plants to decrease our exposure. In the end, we might find ourselves living in a world devoid of oxygen, where only the strongest and most well-protected survive. It's a reminder to appreciate the air we breathe since you never know when it might turn on us.");
        articleList.add(article3);
        Article article4 = new Article(R.drawable.pic_cat, "Tom and Jerry proves that cats can actually talk, but deem humans too stupid", "In a shocking revelation, scientists have discovered that cats are actually capable of speech, but simply choose not to talk to their human companions because they deem us unworthy. It's not \"Meow\", it's \"Meh\", they're looking down on us, we need to unite");
        articleList.add(article4);
        Article article5 = new Article(R.drawable.pic_chatgpt, "Most of the articles are written by ChatGPT", "Really, sometimes I feel like ChatGPT is some kind of content creator and I'm its editor");
        articleList.add(article5);


        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, articleList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}