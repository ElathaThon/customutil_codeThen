package com.topoinventari.customutils;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by elatha on 12/8/17.
 */
public class MustacheUtil {

    /** Takes template and subtitute the placehoders {{}} for the values */
    public static String processTemplate(String filename, Object value) throws IOException {

        MustacheFactory mustache = new DefaultMustacheFactory();
        Mustache template = mustache.compile(filename);
        StringWriter writer = new StringWriter();
        template.execute(writer, value).flush();

        return writer.toString();

    }

    /** Generates a href string that goes to the destination and shows the text */
    public static String generateHref(String destination, String text) {
        return "<a href='"+ destination + "'>" + text + "</a>";
    }

}
