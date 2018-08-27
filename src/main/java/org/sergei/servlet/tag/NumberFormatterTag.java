package org.sergei.servlet.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.text.DecimalFormat;

public class NumberFormatterTag extends SimpleTagSupport {
    private String format;
    private String number;

    public NumberFormatterTag() {
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void doTag() throws JspException {
        System.out.println("Number is:" + number);
        System.out.println("Format is:" + format);
        try {
            double amount = Double.parseDouble(number);
            DecimalFormat formatter = new DecimalFormat(format);
            String formattedNumber = formatter.format(amount);
            getJspContext().getOut().write(formattedNumber);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SkipPageException("Exception in formatting " + number
                    + " with format " + format);
        }
    }
}
