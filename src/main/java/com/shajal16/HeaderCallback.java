package com.shajal16;

import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

public class HeaderCallback implements FlatFileHeaderCallback {
    SimpleDateFormat formatter= new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
    Date date = new Date(System.currentTimeMillis());
    String today = formatter.format(date);
    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write("H|CASH|"+today.toUpperCase());
    }
}