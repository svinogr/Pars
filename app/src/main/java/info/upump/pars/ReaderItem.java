package info.upump.pars;

import android.content.Context;
import android.content.res.AssetManager;

import java.util.List;

import info.upump.pars.entity.Question;

public abstract class ReaderItem {
    protected String name;
    protected Context context;
    protected AssetManager assetManager;

    public ReaderItem(String name, Context context) {
        this.name = name;
        this.context = context;
        assetManager = context.getAssets();
    }

    abstract List<Question> getResultReader();
}
