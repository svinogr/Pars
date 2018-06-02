package info.upump.pars;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import info.upump.pars.entity.Question;

public class ReaderJSON extends ReaderItem {

    public ReaderJSON(String name, Context context) {
        super(name, context);
    }

    @Override
    List<Question> getResultReader() {
        return parse();
    }

    private List<Question> parse() {
        return null;
    }


    private String read(String name) {
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(assetManager.open("data.json"), "windows-1251"));
            String line;


            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text.toString();
    }
}
