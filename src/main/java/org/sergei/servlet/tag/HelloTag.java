package org.sergei.servlet.tag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class HelloTag extends TagSupport {

    @Override
    public int doStartTag() {
        JspWriter jspWriter = pageContext.getOut();

        try {
            jspWriter.print("Hello world!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }
}
